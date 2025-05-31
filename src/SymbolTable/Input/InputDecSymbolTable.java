package SymbolTable.Input;

import LogHandler.ColorsConsole;
import LogHandler.ErrorType;
import LogHandler.LogHandler;
import LogHandler.SemanticException;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class InputDecSymbolTable {
    private final Map<String, InputDecSymbol> symbols = new LinkedHashMap<>();

    public boolean setSymbol(InputDecSymbol symbol,String fileName) {
        if (lookup(symbol.getName())) {
            Map errdata=new HashMap();
            errdata.put("name",symbol.getName());
            errdata.put("line",symbol.getLine());
            errdata.put("fileName",fileName);
            String errMessage= LogHandler.getErrMessage(ErrorType.InputDefined,errdata);
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
            String errMessage=LogHandler.getErrMessage(ErrorType.InputNotFound,errdata);
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

    public Map<String, InputDecSymbol> getSymbols() {
        return symbols;
    }

    public void print() {
        System.out.println(  ColorsConsole.GREEN +"========== Input Declaration Symbol Table =========="+ColorsConsole.RESET );
        for (InputDecSymbol s : symbols.values()) {
            System.out.println(  " - " + s.getName()  + " (line " + s.getLine() + ")");
        }
    }
}
