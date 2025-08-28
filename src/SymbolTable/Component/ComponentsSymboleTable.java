package SymbolTable.Component;

import LogHandler.ColorsConsole;
import LogHandler.ErrorType;
import LogHandler.LogHandler;
import LogHandler.SemanticException;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ComponentsSymboleTable {
  public   static final Map<String, ComponentSymbol> symbols = new LinkedHashMap<>();

    public boolean setSymbol(ComponentSymbol symbol,String fileName) {
        if (lookup(symbol.getName())) {
            Map errdata=new HashMap();
            errdata.put("name",symbol.getName());
            errdata.put("line",symbol.getLine());
            errdata.put("fileName",fileName);
            String errMessage=LogHandler.getErrMessage(ErrorType.ComponentDefined,errdata);
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
            String errMessage=LogHandler.getErrMessage(ErrorType.ComponentNotFound,errdata);
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("========== Component Declaration Symbol Table ==========")
                .append("\n");

        for (ComponentSymbol s : symbols.values()) {
            sb.append(" ------- ")
                    .append(s.getName())
                    .append("-component (line ")
                    .append(s.getLine())
                    .append(") ---------------\n");

            sb.append(s.getProperties().toString()).append("\n");
            sb.append(s.getMethods().toString()).append("\n");
            sb.append(s.getInputs().toString()).append("\n");
        }

        return sb.toString();
    }

}
