package SymbolTable;

import loghandler.ColorsConsole;
import loghandler.LogHandler;
import loghandler.SemanticException;

import java.util.LinkedHashMap;
import java.util.Map;

public class ComponentsSymboleTable {
    private final Map<String, ComponentSymbol> symbols = new LinkedHashMap<>();

    public boolean setSymbol(ComponentSymbol symbol) {
        if (lookup(symbol.getName())) {
            String errMessage="the Component (" + symbol.getName() + ") at file(" + symbol.getLine() + ") at line(" + symbol.getLine() + ") is defined";
            RuntimeException exception=new SemanticException(errMessage);
            LogHandler.log(exception);
            //  throw exception;
        }
        symbols.put(symbol.getName(), symbol);
        return true;
    }
    public boolean check(String name,String path){
        if (!lookup(name)) {
            String errMessage="Cannot find module " + name + " at " + path;
            RuntimeException exception=new SemanticException(errMessage);
            LogHandler.log(exception);
            //  throw exception;
            return false;
        }
        return true;
    }

    public boolean lookup(String name) {
        if (symbols.containsKey(name)) {
            return true;
        }
        return false;
    }

    public Map<String, ComponentSymbol> getSymbols() {
        return symbols;
    }

    public void print() {
        System.out.println(  ColorsConsole.GREEN +"========== Component Declaration Symbol Table =========="+ColorsConsole.RESET );
        for (ComponentSymbol s : symbols.values()) {
            System.out.println(  " - " + s.getName()  + " (line " + s.getLine() + ")");
            s.getProperties().print();
            System.out.println( ColorsConsole.GREEN+ " ------------------------------ "  );
        }
    }
}
