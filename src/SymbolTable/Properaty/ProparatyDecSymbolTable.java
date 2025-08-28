package SymbolTable.Properaty;

import LogHandler.ColorsConsole;
import LogHandler.ErrorType;
import LogHandler.LogHandler;
import LogHandler.SemanticException;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProparatyDecSymbolTable {
    private final Map<String, ProparatyDecSymbol> symbols = new LinkedHashMap<>();

    public boolean setSymbol(ProparatyDecSymbol symbol,String fileName) {
        if (lookup(symbol.getName())) {
            Map errdata=new HashMap();
            errdata.put("name",symbol.getName());
            errdata.put("fileName",fileName);
            errdata.put("line",symbol.getLine());
            String errMessage=LogHandler.getErrMessage(ErrorType.PrparetyDefined,errdata);
            RuntimeException exception=new SemanticException(errMessage);
            LogHandler.log(exception);
            //  throw exception;
        }
        symbols.put(symbol.getName(), symbol);
        return true;
    }
    public boolean check(String expr,String path){
        String name=findPropertyfromExpression(expr);
        if (!lookup(name)) {
            Map errdata=new HashMap();
            errdata.put("name",name);
            errdata.put("fileName",path);
            String errMessage=LogHandler.getErrMessage(ErrorType.PrparetyNotFound,errdata);
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
    private String findPropertyfromExpression(String expr){

        String from = "identifier{";
        String to = "}";

        int startIndex = expr.indexOf(from);
        int endIndex = expr.indexOf(to);

        if (startIndex != -1 && endIndex != -1 && endIndex > startIndex) {

            String result = expr.substring(startIndex + from.length(), endIndex).trim();
            return result;
        } else {
            return null;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("========== Property Declaration Symbol Table ==========")
                .append("\n");

        for (ProparatyDecSymbol s : symbols.values()) {
            sb.append(" - ")
                    .append(s.getName())
                    .append(": type :")
                    .append(s.getType())
                    .append(" (line ")
                    .append(s.getLine())
                    .append(")")
                    .append("\n");
        }

        return sb.toString();
    }

}
