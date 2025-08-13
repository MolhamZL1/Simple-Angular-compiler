package AST;

import Code_Generation.CodeResult;

public class Type implements ASTNode{
    private String type;

    public Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Type{" +
                type +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        return null;
    }
}
