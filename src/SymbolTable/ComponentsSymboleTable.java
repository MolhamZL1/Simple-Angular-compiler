package SymbolTable;

import loghandler.ColorsConsole;
import loghandler.ErrorType;
import loghandler.LogHandler;
import loghandler.SemanticException;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ComponentsSymboleTable {
    private final Map<String, ComponentSymbol> symbols = new LinkedHashMap<>();

    public boolean setSymbol(ComponentSymbol symbol) {
        if (lookup(symbol.getName())) {
            Map errdata=new HashMap();
            errdata.put("name",symbol.getName());
            errdata.put("line",symbol.getLine());
            errdata.put("fileName","fileName");
            String errMessage=LogHandler.getErrmessage(ErrorType.ComponentDefined,errdata);
            RuntimeException exception=new SemanticException(errMessage);
            LogHandler.log(exception);
            //  throw exception;
        }
        symbols.put(symbol.getName(), symbol);
        return true;
    }
    public boolean check(String name,String path){
        if (!lookup(name)) {
            Map errdata=new HashMap();
            errdata.put("name",name);
            errdata.put("fileName",path);
            String errMessage=LogHandler.getErrmessage(ErrorType.ComponentNotFound,errdata);
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
