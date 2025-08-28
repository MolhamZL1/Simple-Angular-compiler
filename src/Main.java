import AST.Program;
import Code_Generation.CodeGeneration;
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
import utils.FileManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    /* =================== إعدادات عامة =================== */

    private static final String ROOT     = "src/Tests/src";
    private static final Path   DIST_DIR = Paths.get("dist");
    private static final Path   REPORT   = DIST_DIR.resolve("ast-report.txt");

    private static final ComponentsSymboleTable COMPONENTS = new ComponentsSymboleTable();

    /* =================== Utilities =================== */

    private static boolean isTarget(File f){
        if (f == null || !f.isFile()) return false;
        String n = f.getName();
        return n.endsWith(".component.ts") || n.endsWith(".component.html");
    }

    private static boolean isComponentTs(File f){
        return f != null && f.isFile() && f.getName().endsWith(".component.ts");
    }

    private static void ensureDist() throws IOException {
        Files.createDirectories(DIST_DIR.toAbsolutePath());
    }

    private static ParseTree parse(String source) throws IOException {
        CharStream cs = fromFileName(source);
        AngularLexer lexer  = new AngularLexer(cs);
        CommonTokenStream t = new CommonTokenStream(lexer);
        AngularParser parser= new AngularParser(t);
        return parser.program();
    }

    /* =================== Symbol Table =================== */

    private static void setSymbolTable(File file) throws IOException {
        if (!isComponentTs(file)) return;

        String source = file.getPath();
        ParseTree tree = parse(source);

        ComponentSymbol symbol = new ComponentSymbol(source);
        new SymbolTableInitializerVisitor(symbol, source).visit(tree);

        // ملاحظة: لا نتعامل مع أي CSS هنا (لا fallback ولا إنشاء)
        COMPONENTS.setSymbol(symbol, source);
    }

    private static void setSymbolTables(String root) throws IOException {
        File folder = new File(root);
        File[] files = folder.listFiles();
        if (files == null) return;

        Arrays.sort(files, Comparator.comparing(File::getPath));
        for (File f : files) {
            if (f.isDirectory()) setSymbolTables(f.getPath());
            else setSymbolTable(f);
        }
    }

    /* =================== Dump: Symbol Table + AST =================== */

    private static String dumpSymbolTable(){
        StringBuilder sb = new StringBuilder();
        sb.append("========== Component Declaration Symbol Table ==========\n");
        try {
            var map = COMPONENTS.getSymbols();
            List<Map.Entry<String, ComponentSymbol>> entries = new ArrayList<>(map.entrySet());
            entries.sort(Comparator.comparing(e -> {
                ComponentSymbol c = e.getValue();
                return c==null || c.getName()==null ? "" : c.getName();
            }));

            for (var e : entries) {
                ComponentSymbol c = e.getValue();
                String name = (c==null || c.getName()==null) ? "(unnamed)" : c.getName();
                sb.append(" ------- ").append(name).append(" (line ").append(c.getLine()).append(") ---------------\n");

                // خصائص
                sb.append("========== Property Declaration Symbol Table ==========\n");
                sb.append(dumpInnerSymbols(c==null? null : c.getProperties()));

                // دوال
                sb.append("========== Method Declaration Symbol Table ==========\n");
                sb.append(dumpInnerSymbols(c==null? null : c.getMethods()));

                // Inputs
                sb.append("========== Input Declaration Symbol Table ==========\n");
                sb.append(dumpInnerSymbols(c==null? null : c.getInputs()));
            }
        } catch (Throwable t) {
            sb.append(String.valueOf(COMPONENTS)).append("\n");
        }
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    private static String dumpInnerSymbols(Object table){
        if (table == null) return "(empty)\n";
        StringBuilder sb = new StringBuilder();
        try {
            var m = table.getClass().getMethod("getSymbols");
            Object res = m.invoke(table);
            if (res instanceof Map<?,?> mp) {
                if (mp.isEmpty()) return "";
                for (var ent : mp.entrySet()) {
                    String key = String.valueOf(ent.getKey());
                    Object val = ent.getValue();
                    sb.append(" - ").append(key);
                    try {
                        var gm = val.getClass().getMethod("getType");
                        Object ty = gm.invoke(val);
                        sb.append(": type :").append(ty);
                    } catch (Throwable ignored){}
                    try {
                        var gl = val.getClass().getMethod("getLine");
                        Object ln = gl.invoke(val);
                        sb.append(" (line ").append(ln).append(")");
                    } catch (Throwable ignored){}
                    sb.append("\n");
                }
                return sb.toString();
            }
            return String.valueOf(res) + "\n";
        } catch (Throwable ignore) {
            return String.valueOf(table) + "\n";
        }
    }

    private static String dumpAstForFile(File file) throws IOException {
        String source = file.getPath();
        ParseTree tree = parse(source);
        Program program = (Program) new BaseVisitor(COMPONENTS, source).visit(tree);

        StringBuilder sb = new StringBuilder();
        sb.append("=============================================\n");
        sb.append("AST for: ").append(file.getPath()).append("\n");
        sb.append("=============================================\n");
        sb.append(program).append("\n\n");
        return sb.toString();
    }

    private static void walkAndDumpAst(String root, StringBuilder out) throws IOException {
        File folder = new File(root);
        File[] files = folder.listFiles();
        if (files == null) return;

        Arrays.sort(files, Comparator.comparing(File::getPath));
        for (File f : files) {
            if (f.isDirectory()) {
                walkAndDumpAst(f.getPath(), out);
            } else if (isTarget(f)) {
                out.append(dumpAstForFile(f));
            }
        }
    }

    /* =================== Main =================== */

    public static void main(String[] args) throws IOException {
        LogHandler.clear();

        String root = (args != null && args.length > 0) ? args[0] : ROOT;
        System.out.println(ColorsConsole.YELLOW + "Scanning: " + new File(root).getAbsolutePath() + ColorsConsole.RESET);

        // 1) إبني الـ Symbol Table من ملفات .component.ts (بدون أي CSS)
        setSymbolTables(root);
//
//        // 2) حضّر التقرير
//        ensureDist();
//        StringBuilder report = new StringBuilder();
//        report.append("GENERATED REPORT\n")
//                .append("Root: ").append(Paths.get(root).toAbsolutePath()).append("\n\n");
//
//        // 2.1 Symbol Table
//        report.append(dumpSymbolTable()).append("\n");
//
//        // 2.2 AST لكل ملف هدف (.component.ts/.component.html)
//        walkAndDumpAst(root, report);
//
//        // 3) اكتب التقرير إلى dist/ast-report.txt باستخدام FileManager
//        FileManager.writeFile(REPORT.toString(), report.toString());
//        System.out.println(ColorsConsole.CYAN + "→ Wrote AST & SymbolTable report: " + REPORT.toAbsolutePath() + ColorsConsole.RESET);
        CodeGeneration codeGeneration=new CodeGeneration(root,COMPONENTS);
        codeGeneration.generateComponent();
    }
}
