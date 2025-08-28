package SymbolTable.ArgsMethod;

import LogHandler.ColorsConsole;
import LogHandler.ErrorType;
import LogHandler.LogHandler;
import LogHandler.SemanticException;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArgsMethodSymbolTable {
    private final Map<String, ArgsMethodSymbol> symbols = new LinkedHashMap<>();

    public boolean setSymbol(ArgsMethodSymbol symbol,String methodName,String fileName) {
        if (lookup(symbol.getName())) {
            Map errdata=new HashMap();
            errdata.put("name",symbol.getName());
            errdata.put("line",symbol.getLine());
            errdata.put("methodName",methodName);
            errdata.put("fileName",fileName);
            String errMessage= LogHandler.getErrMessage(ErrorType.ArgsMethodDefined,errdata);
            RuntimeException exception=new SemanticException(errMessage);
            LogHandler.log(exception);
            //  throw exception;
        }
        symbols.put(symbol.getName(), symbol);
        return true;
    }
//    public boolean check(String name,String path){
//        if (!lookup(name)) {
//            Map errdata=new HashMap();
//            errdata.put("name",name);
//            errdata.put("fileName",path);
//            String errMessage=LogHandler.getErrmessage(ErrorType.InputNotFound,errdata);
//            RuntimeException exception=new SemanticException(errMessage);
//            LogHandler.log(exception);
//            //  throw exception;
//            return false;
//        }
//        return true;
//    }

    public boolean lookup(String name) {
        if (symbols.containsKey(name)) {
            return true;
        }
        return false;
    }

    public Map<String, ArgsMethodSymbol> getSymbols() {
        return symbols;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("==== Arguments Declaration Symbol Table ====")
                .append("\n");

        for (ArgsMethodSymbol s : symbols.values()) {
            sb.append(" - ")
                    .append(s.getName())
                    .append(" (line ")
                    .append(s.getLine())
                    .append(")")
                    .append("\n");
        }

        sb.append("--------------------");

        return sb.toString();
    }

}
