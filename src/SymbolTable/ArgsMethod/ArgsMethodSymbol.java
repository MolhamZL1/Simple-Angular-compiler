package SymbolTable.ArgsMethod;

import AST.ExpressionsClasses.Expression;
import SymbolTable.Symbol;

public class ArgsMethodSymbol implements Symbol {
    private String name;
    private String type;
    private Expression value;
    private int line;

    public ArgsMethodSymbol(String name, String type, int line) {
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
