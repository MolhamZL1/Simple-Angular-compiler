package Code_Generation;

import AST.Program;
import SymbolTable.Component.ComponentsSymboleTable;
import antlr.AngularLexer;
import antlr.AngularParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import utils.FileManager;
import visitor.BaseVisitor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class CodeGeneration{
    private String rootPath;
    private ComponentsSymboleTable componentsSymboleTable ;

    private static final Path DIST_DIR = Paths.get("dist");




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
    public void generateComponent() throws IOException {
        ParseTree rootTree=parse(rootPath+"/app/app.component.ts");

        Program rootProgram = (Program) new BaseVisitor(componentsSymboleTable, rootPath+"/app/app.component.ts").visit(rootTree);
      CodeResult codeResult=  rootProgram.generateCode();
      generateHtml(codeResult.html);
      //generateJs(codeResult.js);

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
                     "  <title>MyShop</title>\n" +
                     "  <base href=\"/\">\n" +
                     "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                     "  <link rel=\"icon\" type=\"image/x-icon\" href=\"favicon.ico\">\n" +
                     "</head>\n" +
                     "<body>\n" +
                    body +
                     "</body>\n" +
                     "<script src=\"index.js\"></script>\n"+
                     "</html>\n");
   }
}