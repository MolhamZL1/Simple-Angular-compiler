package SymbolTable;

import AST.ExpressionsClasses.Expression;

public class Symbol {
    public String name;
    public String type;
    //public Expression value;
    public int line;

    public Symbol(String name, String type, int line) {
        this.name = name;
        this.type = type;
        this.line = line;
    }
}
