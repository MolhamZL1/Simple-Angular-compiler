import AST.Program;
import Code_Generation.CodeResult;
import SymbolTable.Component.ComponentSymbol;
import SymbolTable.Component.ComponentsSymboleTable;
import antlr.AngularLexer;
import antlr.AngularParser;
import LogHandler.ColorsConsole;
import LogHandler.LogHandler;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.BaseVisitor;
import visitor.SymbolTableInitializerVisitor;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    /* ========================= Globals ========================= */

    static ComponentsSymboleTable componentsSymTable = new ComponentsSymboleTable();

    // خرائط ربط المسارات بالأسماء
    static final Map<String, String> compByTplPath = new HashMap<>();  // abs templatePath -> compName
    static final Map<String, String> compByTsPath  = new HashMap<>();  // abs tsPath -> compName

    // سكربتات يجب تحميلها لكل كومبوننت (بالترتيب: TS ثم HTML)
    static final Map<String, List<String>> scriptsByComp = new LinkedHashMap<>();

    // JS helper للسطر الأول بأي ملف JS مولّد
    static final String JS_HEADER = "function __val(x){ return x==null ? '' : x; }\n";
    static boolean headerPrintedToConsole = false;

    static String lastRunRootPath = null;

    /* ========================= Symbol Table ========================= */

    static void setSymbolTable(File file) throws IOException {
        if (!file.getName().endsWith(".component.ts")) return;

        String source = file.getPath();
        CharStream cs = fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        ParseTree tree = parser.program();

        ComponentSymbol csym = new ComponentSymbol();
        new SymbolTableInitializerVisitor(csym, source).visit(tree);

        // fallback للـ css لو مش محدد
        tryAddDefaultCssIfMissing(csym, Paths.get(source));

        componentsSymTable.setSymbol(csym, source);

        // خزّن خرائط المسارات
        String compName = safe(csym.getName());
        if (!compName.isBlank()) {
            compByTsPath.put(abs(source), compName);
        }
        if (csym.getTemplatePath() != null && !csym.getTemplatePath().isBlank()) {
            compByTplPath.put(abs(csym.getTemplatePath()), compName);
        }
    }

    static void setSymbolTables(String root) throws IOException {
        File folder = new File(root);
        File[] files = folder.listFiles();
        if (files == null) return;

        Arrays.sort(files, Comparator.comparing(File::getPath));
        for (File f : files) {
            if (f.isDirectory()) setSymbolTables(f.getPath());
            else if (f.getName().endsWith(".ts")) setSymbolTable(f);
        }
    }

    /* ========================= Helpers ========================= */

    static boolean isSpec(File f){ return f.getName().endsWith(".spec.ts"); }
    static boolean isTargetFile(File f) {
        String n = f.getName();
        return n.endsWith(".component.html") || n.endsWith(".component.ts");
    }
    static String abs(String p){ return Paths.get(p).toAbsolutePath().normalize().toString(); }
    static String safe(String s){ return s==null? "" : s; }

    static void tryAddDefaultCssIfMissing(ComponentSymbol cs, Path tsFile) {
        try {
            if (cs.getStylePath()!=null && !cs.getStylePath().isBlank()) return;
            Path dir = tsFile.toAbsolutePath().getParent();
            String guess = tsFile.getFileName().toString().replace(".component.ts", ".component.css");
            Path p = dir.resolve(guess);
            if (Files.exists(p)) cs.setStylePath(p.toString());
        } catch (Exception ignored) {}
    }

    /* ========================= Codegen ========================= */

    static CodeResult runGenerate(File file) throws IOException {
        String source = file.getPath();
        CharStream cs = fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        ParseTree tree = parser.program();

        Program program = (Program) new BaseVisitor(componentsSymTable, source).visit(tree);

        System.out.println(ColorsConsole.GREEN + "======= Parser Output: " + file.getName() + " =======" + ColorsConsole.RESET);

        CodeResult s = (program != null) ? program.generateCode() : new CodeResult("", "");
        if (s == null) s = new CodeResult("", "");

        // للطباعة فقط
        String toConsoleJs = headerPrintedToConsole ? safe(s.js) : (JS_HEADER + safe(s.js));
        headerPrintedToConsole = true;
        System.out.println(safe(s.html) + "<==========>" + toConsoleJs);

        return s;
    }

    static void writeOut(File src, CodeResult s) throws IOException {
        Path dist = Path.of("dist").toAbsolutePath();
        Files.createDirectories(dist);

        String srcName = src.getName(); // ex: product-list.component.html
        Path htmlOut = dist.resolve(srcName + ".gen.html");
        Path jsOut   = dist.resolve(srcName + ".gen.js");

        boolean wrote = false;
        if (!safe(s.html).isBlank()) {
            Files.writeString(htmlOut, s.html, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println(ColorsConsole.BLUE + "→ Wrote: " + htmlOut + ColorsConsole.RESET);
            wrote = true;
        }
        if (!safe(s.js).isBlank()) {
            Files.writeString(jsOut, JS_HEADER + s.js, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println(ColorsConsole.BLUE + "→ Wrote: " + jsOut + ColorsConsole.RESET);
            wrote = true;
        }
        if (!wrote) {
            System.out.println(ColorsConsole.YELLOW + "↷ Skipped empty output for " + srcName + ColorsConsole.RESET);
        }
    }

    // fallback: لو فشل توليد JS من .component.ts (NPE من الvisitor)، استخرج قيم بسيطة
    static Path tsFallbackState(File tsFile, String compName) throws IOException {
        String ts = Files.readString(tsFile.toPath(), StandardCharsets.UTF_8);
        ts = ts.replace("this.", "");

        // يدعم: [public|private|protected|readonly|static]? name [?] [: type]? = RHS;
        Pattern p = Pattern.compile("(?ms)^\\s*(?:public|private|protected|readonly|static\\s+)?([A-Za-z_][A-Za-z0-9_]*)\\s*\\??\\s*(?::\\s*[^=;]+)?\\s*=\\s*(.*?);\\s*$");
        Matcher m = p.matcher(ts);

        StringBuilder js = new StringBuilder();
        js.append("// Fallback extracted from ").append(tsFile.getName()).append("\n");
        while (m.find()) {
            String name = m.group(1);
            String rhs  = m.group(2).trim().replace("\r"," ").replace("\n"," ");
            if (List.of("import","export","class","constructor").contains(name)) continue;
            js.append("var ").append(name).append(" = ").append(rhs).append(";\n");
        }

        Path out = Path.of("dist").resolve(tsFile.getName() + ".fallback.js").toAbsolutePath();
        Files.writeString(out, js.toString(), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        System.out.println(ColorsConsole.YELLOW + "→ Fallback state JS: " + out + ColorsConsole.RESET);
        return out.getFileName();
    }

    static void processFile(File f) throws IOException {
        if (isSpec(f) || !isTargetFile(f)) return;

        try {
            CodeResult r = runGenerate(f);
            writeOut(f, r);

            String absPath = abs(f.getPath());

            if (f.getName().endsWith(".component.html")) {
                // اربط سكربت HTML بالـ component المناسب حسب templatePath من الـ SymbolTable
                String compName = compByTplPath.get(absPath);
                if (compName != null) {
                    Path genJs = Path.of("dist").resolve(f.getName() + ".gen.js").toAbsolutePath();
                    if (Files.exists(genJs) && Files.size(genJs) > 0) {
                        scriptsByComp.computeIfAbsent(compName, k -> new ArrayList<>())
                                .add(genJs.getFileName().toString());
                    }
                }
            } else if (f.getName().endsWith(".component.ts")) {
                // اربط سكربت TS بالـ component حسب tsPath من الـ SymbolTable
                String compName = compByTsPath.get(absPath);
                if (compName != null) {
                    Path genJs = Path.of("dist").resolve(f.getName() + ".gen.js").toAbsolutePath();
                    if (Files.exists(genJs) && Files.size(genJs) > 0) {
                        // نحطّه أوّل (لازم يتنفّذ قبل template.js)
                        scriptsByComp.computeIfAbsent(compName, k -> new ArrayList<>())
                                .add(0, genJs.getFileName().toString());
                    } else {
                        // لو ما في JS (أو Empty) جرّب fallback
                        Path fb = tsFallbackState(f, compName);
                        scriptsByComp.computeIfAbsent(compName, k -> new ArrayList<>())
                                .add(0, fb.toString());
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ColorsConsole.RED + "Codegen error for " + f.getName() + ": " + ex.getMessage() + ColorsConsole.RESET);
            // في حالة .ts، قدّم fallback بدل الكسر
            if (f.getName().endsWith(".component.ts")) {
                String compName = compByTsPath.get(abs(f.getPath()));
                if (compName != null) {
                    Path fb = tsFallbackState(f, compName);
                    scriptsByComp.computeIfAbsent(compName, k -> new ArrayList<>())
                            .add(0, fb.toString());
                }
            }
        }
    }

    static void startProgram(String path) throws IOException {
        File folder = new File(path);
        File[] files = folder.listFiles();
        if (files == null) return;
        Arrays.sort(files, Comparator.comparing(File::getPath));
        for (File f : files) {
            if (f.isDirectory()) startProgram(f.getPath());
            else processFile(f);
        }
    }

    /* ========================= CSS ========================= */

    static String selectorToClass(String selector){
        if (selector==null || selector.isBlank()) return "ng-host";
        return selector.trim().replaceAll("[^a-zA-Z0-9_-]","-");
    }

    static String rewriteAngularSelectors(String css, String selector){
        String host = "." + selectorToClass(selector);
        String out = css==null? "" : css;
        out = out.replaceAll(":host-context\\(([^)]+)\\)", "$1 " + host);
        out = out.replace("::ng-deep"," ");
        out = out.replace(":host", host);
        return out;
    }

    static String bundleCssFromSymbols() throws IOException {
        StringBuilder css = new StringBuilder();
        Set<String> seen = new HashSet<>();
        for (var e : componentsSymTable.getSymbols().entrySet()) {
            ComponentSymbol c = e.getValue();
            String p = c.getStylePath();
            if (p==null || p.isBlank()) continue;
            Path path = Path.of(p);
            if (!Files.exists(path)) continue;
            String key = path.toAbsolutePath().toString();
            if (!seen.add(key)) continue;
            String content = Files.readString(path, StandardCharsets.UTF_8);
            String rewritten = rewriteAngularSelectors(content, c.getName());
            css.append("/* ").append(path.getFileName()).append(" -> ").append(c.getName()).append(" */\n")
                    .append(rewritten).append("\n\n");
        }
        return css.toString();
    }

    /* ========================= INDEX (Router + Loader) ========================= */

    static String escapeBackticks(String s){
        if (s==null) return "";
        return s.replace("\\","\\\\").replace("`","\\`");
    }

    static Path buildIndex() throws IOException {
        Path dist = Path.of("dist").toAbsolutePath();
        Files.createDirectories(dist);

        // قوالب لكل كومبوننت (من ناتج HTML)
        StringBuilder templates = new StringBuilder();
        List<String> compList = new ArrayList<>();

        for (var e : componentsSymTable.getSymbols().entrySet()) {
            ComponentSymbol c = e.getValue();
            String tplPath = c.getTemplatePath();
            if (tplPath == null || tplPath.isBlank()) continue;

            String base = Paths.get(tplPath).getFileName().toString(); // ex: product-list.component.html
            Path genHtml = dist.resolve(base + ".gen.html");
            String fragment = Files.exists(genHtml) ? Files.readString(genHtml, StandardCharsets.UTF_8) : "<div class='alert alert-warning'>No generated HTML</div>";

            String hostCls = selectorToClass(c.getName());
            templates.append("<!-- ").append(c.getName()).append(" :: ").append(base).append(" -->\n")
                    .append("<template id=\"tpl-").append(c.getName()).append("\">")
                    .append("<div class=\"ng-host ").append(hostCls).append("\">\n")
                    .append(fragment)
                    .append("\n</div></template>\n\n");

            compList.add(c.getName());
        }

        // CSS inline
        String css = bundleCssFromSymbols();

        // scripts map: comp -> [files...]
        String scriptsMapJson = scriptsByComp.entrySet().stream()
                .map(e -> "\"" + e.getKey().replace("\"","\\\"") + "\":[" +
                        e.getValue().stream().map(v -> "\"" + v.replace("\"","\\\"") + "\"").collect(Collectors.joining(",")) +
                        "]")
                .collect(Collectors.joining(","));
        String compArr = compList.stream().map(n -> "\"" + n.replace("\"","\\\"") + "\"").collect(Collectors.joining(","));

        String LOADER_JS = """
<script>
  window.__SCRIPTS_MAP__ = { %s };
  window.__COMP_LIST__ = [ %s ];

  (function(){
    function $(id){ return document.getElementById(id); }

    function clearPrevScripts(){
      document.querySelectorAll('script[data-dynamic="1"]').forEach(function(s){ s.parentNode.removeChild(s); });
    }
    function loadScriptsSequential(urls, done){
      if(!urls || !urls.length){ done && done(); return; }
      var i=0;
      function next(){
        if(i>=urls.length){ done && done(); return; }
        var s = document.createElement('script');
        s.src = urls[i] + '?v=' + Date.now();
        s.setAttribute('data-dynamic','1');
        s.onload = function(){ i++; next(); };
        s.onerror = function(){ console.warn('script load failed:', urls[i]); i++; next(); };
        document.body.appendChild(s);
      }
      next();
    }
    function renderComponent(name){
      var tpl = document.getElementById('tpl-'+name);
      var view = $('router-view');
      if(!view){ console.error('no #router-view'); return; }
      if(!tpl){ view.innerHTML = "<div class='alert alert-warning'>Missing component: "+name+"</div>"; return; }
      view.innerHTML = tpl.innerHTML;
      clearPrevScripts();
      var list = (window.__SCRIPTS_MAP__||{})[name] || [];
      // IMPORTANT: TS أولاً ثم HTML
      loadScriptsSequential(list, function(){ /* done */ });
    }
    function find(pred){
      var list = window.__COMP_LIST__ || [];
      for(var i=0;i<list.length;i++){ if(pred(list[i])) return list[i]; }
      return null;
    }
    function guess(path){
      var p=(path||'/').toLowerCase();
      if(p==='/add' || p.indexOf('/add')===0) return find(n=>n.indexOf('add')!==-1) || find(n=>n.indexOf('product-add')!==-1);
      if(p==='/details' || p.indexOf('/detail')===0) return find(n=>n.indexOf('detail')!==-1);
      if(p==='/' || p==='' || p==='#/') return find(n=>n.indexOf('list')!==-1) || find(n=>n.indexOf('root')!==-1) || (window.__COMP_LIST__||[])[0];
      return find(n=>n.indexOf('list')!==-1) || (window.__COMP_LIST__||[])[0];
    }
    function onRoute(){
      var hash = location.hash || '#/';
      var path = hash.replace(/^#/, '');
      var comp = guess(path);
      renderComponent(comp);
    }
    window.addEventListener('hashchange', onRoute);
    window.addEventListener('DOMContentLoaded', onRoute);
  })();
</script>
""".formatted(scriptsMapJson, compArr);

        String NAVBAR = """
<nav class="navbar navbar-expand-lg bg-body-tertiary border-bottom">
  <div class="container">
    <a class="navbar-brand" href="#/">Mini Shop</a>
    <div class="navbar-nav">
      <a class="nav-link" href="#/">Products</a>
      <a class="nav-link" href="#/add">Add Product</a>
      <a class="nav-link" href="#/details">Details</a>
    </div>
  </div>
</nav>
""";

        String HEAD = """
<meta charset="utf-8">
<title>Generated Site</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
%s
</style>
""".formatted(css);

        String BODY = """
%s
<div class="container py-3">
  <div id="router-view"></div>
</div>

<!-- component templates -->
%s
""".formatted(NAVBAR, templates.toString());

        String INDEX = """
<!doctype html>
<html lang="en">
<head>
%s
</head>
<body class="bg-light">
%s
%s
</body>
</html>
""".formatted(HEAD, BODY, LOADER_JS);

        Path index = dist.resolve("index.html");
        Files.writeString(index, INDEX, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        System.out.println(ColorsConsole.CYAN + "→ Wrote index: " + index + ColorsConsole.RESET);
        return index;
    }

    /* ========================= Walk ========================= */

    static void walkAndGenerate(String root) throws IOException {
        File folder = new File(root);
        File[] files = folder.listFiles();
        if (files == null) return;
        Arrays.sort(files, Comparator.comparing(File::getPath));
        for (File f : files) {
            if (f.isDirectory()) walkAndGenerate(f.getPath());
            else if (!isSpec(f) && isTargetFile(f)) processFile(f);
        }
    }

    /* ========================= Main ========================= */

    public static void main(String[] args) throws IOException {
        LogHandler.clear();

        String root = (args!=null && args.length>0) ? args[0] : "src/Tests/";
        lastRunRootPath = root;
        System.out.println(ColorsConsole.YELLOW + "Scanning: " + new File(root).getAbsolutePath() + ColorsConsole.RESET);

        // 1) إبني SymbolTable من .component.ts
        setSymbolTables(root);
        componentsSymTable.print();

        // 2) شغّل generateCode على كل .component.ts و .component.html واكتب النتائج
        walkAndGenerate(root);

        // 3) إبني index.html (templates + CSS inline + Router + dynamic loader)
        Path index = buildIndex();

        // 4) افتح المتصفح
        try {
            if (Desktop.isDesktopSupported()) Desktop.getDesktop().browse(index.toUri());
        } catch (Exception ignored) {}

        System.out.println(ColorsConsole.CYAN + "Done. Dist: " + Path.of("dist").toAbsolutePath() + ColorsConsole.RESET);
    }
}
