package AST;

public class Identifier implements Primary{
    private String identifier;

    public Identifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "\nidentifier{" +
                "identifier='" + identifier + '\'' +
                '}';
    }
}
