package SymbolTable;

import java.util.ArrayDeque;
import java.util.Deque;


public class SemanticAnalyzer {

//    private final Deque<VarDecSymbolTable> scopeStack = new ArrayDeque<>();
//
//    public void enterScope() {
////        VarDecSymbolTable newScope = new VarDecSymbolTable(currentScope());
////        scopeStack.push(newScope);
//    }
//
//    public void exitScope() {
//        this.printAllScopes();
//        scopeStack.pop();
//    }

//  /  public VarDecSymbolTable currentScope() {
//        return scopeStack.peek();
//    }
//
//    public void defineVar(String name, String type, int line) {
//        VarDecSymbol symbol = new VarDecSymbol(name, type, line);
//        VarDecSymbolTable scope = currentScope();
//
//        if (!scope.set(symbol)) {
//            printError("the variable (" + name + ") at line(" + line + ") is defined");
//        }
//    }
//
//    public void useVar(String name, int line) {
//        if (!currentScope().isExist(name)) {
//            printError("the variable (" + name + ") at line(" + line + ") is not defined");
//        }
//    }
//



}
