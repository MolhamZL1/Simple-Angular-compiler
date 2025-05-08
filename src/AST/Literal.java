package AST;

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
}
