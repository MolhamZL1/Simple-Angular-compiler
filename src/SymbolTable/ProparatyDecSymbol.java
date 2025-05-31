package SymbolTable;

import AST.ExpressionsClasses.Expression;

public class ProparatyDecSymbol {
    private String name;
    private String type;
    private Expression value;
    private int line;

    public ProparatyDecSymbol(String name, String type, int line) {
        this.name = name;
        this.type = type;
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    public int getLine() {
        return line;
    }

}
