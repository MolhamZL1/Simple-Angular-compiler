import AST.Program;
import SymbolTable.Component.ComponentSymbol;
import SymbolTable.Component.ComponentsSymboleTable;
import antlr.AngularLexer;
import antlr.AngularParser;
import LogHandler.ColorsConsole;
import LogHandler.LogHandler;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import utils.FileManager;
import visitor.BaseVisitor;
import visitor.SymbolTableInitializerVisitor;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
   static ComponentsSymboleTable componentsSymboleTable=  new ComponentsSymboleTable();


   static void setSymbolTable(File file) throws IOException {
       String source = file.getPath();
       CharStream cs = fromFileName(source);
       AngularLexer lexer = new AngularLexer(cs);
       CommonTokenStream token = new CommonTokenStream(lexer);
       AngularParser parser = new AngularParser(token);
       ParseTree tree = parser.program();
       if(file.getName().endsWith(".component.ts")){
           ComponentSymbol componentSymbol=new ComponentSymbol();
           new SymbolTableInitializerVisitor(componentSymbol,source).visit(tree);
           componentsSymboleTable.setSymbol(componentSymbol,source);
       }
   }
    static void setSymbolTables(String path)throws IOException {
        File folder = new File(path);
        File[] files = folder.listFiles();
        for (int i = 0; i < files.length; i++) {

            if (files[i].isFile()) {
                if (files[i].getName().endsWith(".component.ts"))
                    setSymbolTable(files[i]);
//                else if(files[i].getName().contains(".html"))
//                    setSymbolTable(files[i]);
                else continue;
            }
            else {
                setSymbolTables(files[i].getPath());
            }
        }
    }
    static void printAST(File file)throws IOException {
        String source = file.getPath();
        CharStream cs = fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        ParseTree tree = parser.program();
        Program program = (Program) new BaseVisitor(componentsSymboleTable ,source).visit(tree);
        System.out.println(ColorsConsole.GREEN+"=================== The Parser Output for "+file.getName() +"==================="+ColorsConsole.RESET);
        System.out.println(program);

    }
    static void startProgram(String path)throws IOException {
        File folder = new File(path);
        File[] files = folder.listFiles();
        for (int i = 0; i < files.length; i++) {

            if (files[i].isFile()) {
                if (files[i].getName().endsWith(".component.ts"))
                    printAST(files[i]);
                else if(files[i].getName().endsWith(".html"))
                         printAST(files[i]);
                else continue;
            }
            else {
                startProgram(files[i].getPath());
            }
        }
    }

    static void  startTest(String path) throws IOException {
        File file = new File(path);
        printAST(file);
    }

    public static void main(String[] args) throws IOException {
        LogHandler.clear();
        setSymbolTables("src/Tests/");
        componentsSymboleTable.print();
        startProgram("src/Tests/");
        Code_Generation.CodeGenerator gen = new Code_Generation.CodeGenerator(componentsSymboleTable);
        gen.generate("src/Tests/index.html", "dist/index.html");
        // مثال JSON مؤقت — بدّله بالبيانات اللي عندك أو استخرجه من SymbolTable
        String initialDataJson = """
{
  "products": [],
  "productItems": [
    {
      "id": "p1",
      "name": "Shirt",
      "price": 29.9,
      "availableQty": 6,
      "rating": 4,
      "images": ["/img/1.jpg"],
      "description": ["Nice cotton shirt"]
    }
  ],
  "selectedProduct": null,
  "selectedImage": "",
  "total": 0
}
""";

        new Code_Generation.JsEmitter(componentsSymboleTable)
                .emit("dist/app.js", "app-root", initialDataJson);


        System.out.println(ColorsConsole.GREEN + "✅ Generated dist/index.html" + ColorsConsole.RESET);
    }
}
