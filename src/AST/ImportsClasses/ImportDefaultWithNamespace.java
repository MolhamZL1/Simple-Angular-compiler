package AST.ImportsClasses;

import AST.Identifier;

public class ImportDefaultWithNamespace implements ImportStatement {
    private Identifier defaultId;
    private Identifier alias;
    private String module;

    public ImportDefaultWithNamespace(Identifier defaultId, Identifier alias, String module) {
        this.defaultId = defaultId;
        this.alias = alias;
        this.module = module;
    }

    @Override
    public String toString() {
        return "\n import{" + defaultId + ", * as " + alias + " from '" + module + "}";
    }
}
