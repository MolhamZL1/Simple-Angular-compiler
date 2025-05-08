package AST;

public class Type implements ASTNode{
    private String type;

    public Type(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type{" +
                type +
                '}';
    }
}
