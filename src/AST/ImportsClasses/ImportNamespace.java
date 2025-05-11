package AST.ImportsClasses;

import AST.Identifier;

public class ImportNamespace implements ImportStatement {
    private Identifier alias;
    private String module;

    public ImportNamespace(Identifier alias, String module) {
        this.alias = alias;
        this.module = module;
    }

    @Override
    public String toString() {
        return "\n import{ * as " + alias + " from '" + module + "}";
    }
}
