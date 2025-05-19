package SymbolTable;

import java.util.ArrayDeque;
import java.util.Deque;


public class SemanticAnalyzer {

    private final Deque<Scope> scopeStack = new ArrayDeque<>();

    public void enterScope() {
        Scope newScope = new Scope(currentScope());
        scopeStack.push(newScope);
    }

    public void exitScope() {
        this.printAllScopes();
        scopeStack.pop();
    }

    public Scope currentScope() {
        return scopeStack.peek();
    }

    public void defineVar(String name, String type, int line) {
        Symbol symbol = new Symbol(name, type, line);
        Scope scope = currentScope();

        if (!scope.define(symbol)) {
            printError("the variable (" + name + ") at line(" + line + ") is defined");
        }
    }

    public void useVar(String name, int line) {
        if (!currentScope().isExist(name)) {
            printError("the variable (" + name + ") at line(" + line + ") is not defined");
        }
    }

    public void printAllScopes() {
        System.out.println(ColorsConsole.GREEN + "============= Symbol Tables =============" +ColorsConsole.RESET);
        int level = 0;
        for (Scope scope : scopeStack) {
            scope.print(level++);
        }
    }

    public void printError(String msg){
        System.err.println(ColorsConsole.RED + "Semantic Error: " + msg + ColorsConsole.RESET);
      System.exit(0);
    }
}
