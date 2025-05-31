import AST.Program;
import SymbolTable.*;
import antlr.AngularLexer;
import antlr.AngularParser;
import loghandler.ColorsConsole;
import loghandler.LogHandler;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.BaseVisitor;
import visitor.SettingSymbolTable;


import java.io.File;
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
       if(file.getName().contains(".component.ts")){
           ComponentSymbol componentSymbol=new ComponentSymbol();
           new SettingSymbolTable(componentSymbol).visit(tree);
           componentsSymboleTable.setSymbol(componentSymbol);
       }
   }
    static void setSymbolTables(String path)throws IOException {
        File folder = new File(path);
        File[] files = folder.listFiles();
        for (int i = 0; i < files.length; i++) {

            if (files[i].isFile()) {
                if (files[i].getName().contains(".ts"))
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
                if (files[i].getName().contains(".ts"))
                    printAST(files[i]);
                else if(files[i].getName().contains(".html"))
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
    }
}
