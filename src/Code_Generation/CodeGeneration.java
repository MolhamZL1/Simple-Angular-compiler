package Code_Generation;

import AST.Program;
import SymbolTable.Component.ComponentSymbol;
import SymbolTable.Component.ComponentsSymboleTable;
import antlr.AngularLexer;
import antlr.AngularParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import utils.FileManager;
import visitor.BaseVisitor;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class CodeGeneration{
    private String rootPath;
    private ComponentsSymboleTable componentsSymboleTable ;

    public static final Path DIST_DIR = Paths.get("dist");




    public CodeGeneration(String rootPath,ComponentsSymboleTable componentsSymboleTable) {
        this.rootPath = rootPath;
        this.componentsSymboleTable=componentsSymboleTable;
    }
    public  static   ParseTree parse(String source) throws IOException {
        CharStream cs = fromFileName(source);
        AngularLexer lexer  = new AngularLexer(cs);
        CommonTokenStream t = new CommonTokenStream(lexer);
        AngularParser parser= new AngularParser(t);
        return parser.program();
    }
    public void generatebaseComponent() throws IOException {
        generateRouting();
        ParseTree rootTree=parse(rootPath+"/app/app.component.ts");

        Program rootProgram = (Program) new BaseVisitor(componentsSymboleTable, rootPath+"/app/app.component.ts").visit(rootTree);
      CodeResult codeResult=  rootProgram.generateCode();
      generateHtml(codeResult.html);

      //generateJs(codeResult.js);
    }
    public String generateComponent(ComponentSymbol componentSymbol) throws IOException {
        ParseTree rootTree=parse(componentSymbol.getPath());
        Program rootProgram = (Program) new BaseVisitor(componentsSymboleTable, componentSymbol.getPath()).visit(rootTree);
        CodeResult codeResult=  rootProgram.generateCode();
        String generatedHtmlPath=componentSymbol.getName().replace("app","").replace("-","");
        FileManager.createFile(DIST_DIR+"/"+generatedHtmlPath+".html");
        FileManager.writeFile(DIST_DIR+"/"+generatedHtmlPath+".html",codeResult.html);
        FileManager.createFile(DIST_DIR+"/"+generatedHtmlPath+".js");
        FileManager.writeFile(DIST_DIR+"/"+generatedHtmlPath+".js",codeResult.js);
        return generatedHtmlPath+".html";
        //generateJs(codeResult.js);
    }
    public static Map<String, String> buildRoutesMap(String routesJs) {
        Map<String, String> map = new LinkedHashMap<>();

        // نمط للمسارات اللي فيها component فقط
        Pattern compPattern = Pattern.compile(
                "\\{\\s*path:\\s*'([^']*)'\\s*,\\s*component:\\s*([A-Za-z0-9_]+)\\s*\\}"
        );
        Matcher compMatcher = compPattern.matcher(routesJs);

        while (compMatcher.find()) {
            String path = compMatcher.group(1);
            String component = compMatcher.group(2);
            map.put(path, component); // القيمة String بدون "redirect"
        }

        return map;
    }
   public ComponentSymbol getComponentByName(String name){
       for (Map.Entry<String, ComponentSymbol> entry : ComponentsSymboleTable.symbols.entrySet()) {
           String key = entry.getKey().replace("app","").replace("-","");
           if (key.equals(name)){
               return entry.getValue();
           }
       }
       return null;
   }

   public void generateRouting()throws IOException{
       ParseTree rootTree=parse(rootPath+"/app/app.routes.ts");

       Program rootProgram = (Program) new BaseVisitor(componentsSymboleTable, rootPath+"/app/app.routes.ts").visit(rootTree);
       CodeResult codeResult=  rootProgram.generateCode();

       Map<String, String> routes = buildRoutesMap(codeResult.js);
       for (Map.Entry<String, String> entry : routes.entrySet()) {
           String key = entry.getKey();
           String value = entry.getValue();
           String newValue = value.toLowerCase().replace("component","");
         ComponentSymbol component=  getComponentByName(newValue);
        String htmlPathGenerated=   generateComponent(component);
           routes.put(key, htmlPathGenerated);
       }
       StringBuilder routesjs=new StringBuilder();
       routes.forEach((k,v) -> routesjs.append("'/" + k + "' : '" + v + "',"));

       FileManager.createFile(DIST_DIR+"/routes.js");
       FileManager.writeFile(DIST_DIR+"/routes.js",
               "const routes = {" +
                       routesjs +
                       "};\n" +
               "\n" +
               "function setActive(path){\n" +
                       "  document.querySelectorAll(\"a[href^='#']\").forEach(a=>{\n" +
                       "    a.classList.toggle(\"active\", a.getAttribute(\"href\") === \"#\" + path);\n" +
                       "  });\n" +
                       "}\n" +
                       "async function render(){\n" +
                       "  const path = location.hash.slice(1) || \"/\";\n" +
                       "  const file = routes[path];\n" +
                       "  const outlet = document.getElementById(\"outlet\");\n" +
                       "\n" +
                       "  setActive(path);\n" +
                       "\n" +
                       "  if (file) {\n" +
                       "    try {\n" +
                       "      const html = await fetch(file).then(r=>r.text());\n" +
                       "      outlet.innerHTML = html;\n" +
                       "    } catch (e) {\n" +
                       "      outlet.innerHTML = \"<h2>خطأ</h2><p>Couldn't Open this Page</p>\";\n" +
                       "    }\n" +
                       "  } else {\n" +
                       "    outlet.innerHTML = \"<h2>404</h2><p>Not Fount</p>\";\n" +
                       "  }\n" +
                       "}\n" +
                       "\n" +
                       "window.addEventListener(\"load\", render);\n" +
                       "window.addEventListener(\"hashchange\", render);\n");
   }

//    public void  generateJs(String body){
//        FileManager.createFile(DIST_DIR+"/index.js");
//        FileManager.writeFile(DIST_DIR+"/index.js",body);
//    }
 public void generateHtml(String body) throws IOException {
     FileManager.createFile(DIST_DIR+"/index.html");
     FileManager.writeFile(DIST_DIR+"/index.html",
             "<!doctype html>\n" +
                     "<html lang=\"en\">\n" +
                     "<head>\n" +
                     "  <meta charset=\"utf-8\">\n" +
                     "  <title>Angular Project</title>\n" +
                     "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                     "<link rel=\"stylesheet\" href=\"styles.css\">"+
                     "</head>\n" +
                     "<body>\n" +
                    body +
                     "<script src=\"routes.js\"></script>\n"+
                     "<script src=\"index.js\"></script>\n"+
                     "</body>\n" +
                     "</html>\n");
   }
}