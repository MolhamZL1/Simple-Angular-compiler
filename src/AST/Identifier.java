package AST;

import AST.Primary.Primary;
import Code_Generation.CodeResult;

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
               identifier  +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        return new CodeResult(identifier, "");
    }


}
