package AST.ImportsClasses;


import AST.Identifier;
import Code_Generation.CodeResult;

public class ImportDefault implements ImportStatement {
    private Identifier name;
    private String module;

    @Override
    public CodeResult generateCode() {
        return null;
    }

    public ImportDefault(Identifier name, String module) {
        this.name = name;
        this.module = module;
    }

    @Override
    public String toString() {
        return "\n import{" + name + " from '" + module + "}";
    }
}
