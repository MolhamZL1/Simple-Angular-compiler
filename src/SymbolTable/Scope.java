package SymbolTable;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    private final Map<String, Symbol> symbols = new LinkedHashMap<>();
    private final Scope parent;

    public Scope(Scope parent) {
        this.parent = parent;
    }

    public boolean define(Symbol symbol) {
        if (symbols.containsKey(symbol.name)) {
            return false;
        }
        symbols.put(symbol.name, symbol);
        return true;
    }

    public boolean isExist(String name) {
        if (symbols.containsKey(name)) {
            return true;
        } else if (parent != null) {
            parent.isExist(name);
        }
        return false;
    }

    public Scope getParent() {
        return parent;
    }

    public void print(int level) {
        String indent = "  ".repeat(level);
        System.out.println(indent + "Scope level " + level + ":");
        for (Symbol s : symbols.values()) {
            System.out.println(indent + "- " + s.name + " : " + s.type + " (line " + s.line + ")");
        }
    }
}
