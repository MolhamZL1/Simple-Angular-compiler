package SymbolTable;

import loghandler.ColorsConsole;
import loghandler.LogHandler;
import loghandler.SemanticException;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProparatyDecSymbolTable {
    private final Map<String, ProparatyDecSymbol> symbols = new LinkedHashMap<>();

    public boolean setSymbol(ProparatyDecSymbol symbol) {
        if (lookup(symbol.getName())) {
            String errMessage="the Proparaty (" + symbol.getName() + ") at file(" + symbol.getLine() + ") at line(" + symbol.getLine() + ") is defined";
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
            String errMessage="Property " + name + " at " + path+" does not exist on type "+path;
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
