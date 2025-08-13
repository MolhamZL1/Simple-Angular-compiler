package AST.Primary;

import Code_Generation.CodeResult;

public class Literal implements Primary{
private String literal;

    public Literal(String literal) {
        this.literal = literal;
    }

    @Override
    public String toString() {
        return "Literal{" +
               literal +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        return null;
    }
}
