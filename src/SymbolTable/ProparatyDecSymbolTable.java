package SymbolTable;

import loghandler.ColorsConsole;
import loghandler.ErrorType;
import loghandler.LogHandler;
import loghandler.SemanticException;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProparatyDecSymbolTable {
    private final Map<String, ProparatyDecSymbol> symbols = new LinkedHashMap<>();

    public boolean setSymbol(ProparatyDecSymbol symbol) {
        if (lookup(symbol.getName())) {
            Map errdata=new HashMap();
            errdata.put("name",symbol.getName());
            errdata.put("fileName","fileName");
            errdata.put("line",symbol.getLine());
            String errMessage=LogHandler.getErrmessage(ErrorType.PrparetyDefined,errdata);
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
            String errMessage=LogHandler.getErrmessage(ErrorType.PrparetyNotFound,errdata);
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

    public void print() {
        System.out.println(  ColorsConsole.GREEN +"========== Property Declaration Symbol Table =========="+ColorsConsole.RESET );
        for (ProparatyDecSymbol s : symbols.values()) {
            System.out.println(  " - " + s.getName()  + ": type :"+s.getType()+ " : value :"+ s.getValue() +" (line " + s.getLine() + ")");
        }
    }
}
