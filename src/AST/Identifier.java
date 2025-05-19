package AST;

import AST.Primary.Primary;

public class Identifier implements Primary {
    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public Identifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "\nidentifier{" +
               identifier + '\'' +
                '}';
    }
}
