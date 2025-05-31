package SymbolTable;

import AST.ExpressionsClasses.Expression;

public class MethodDecSymbol implements Symbol{
    private String name;
    private String type;
    private Expression value;
    private int line;

    public MethodDecSymbol(String name, String type, int line) {
        this.name = name;
        this.type = type;
        this.line = line;
    }
    @Override
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
    @Override
    public int getLine() {
        return line;
    }

}
