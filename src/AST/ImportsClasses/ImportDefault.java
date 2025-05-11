package AST.ImportsClasses;


import AST.Identifier;

public class ImportDefault implements ImportStatement {
    private Identifier name;
    private String module;

    public ImportDefault(Identifier name, String module) {
        this.name = name;
        this.module = module;
    }

    @Override
    public String toString() {
        return "\n import{" + name + " from '" + module + "}";
    }
}
