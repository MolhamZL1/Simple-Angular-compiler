package AST.ImportsClasses;

import AST.Identifier;
import Code_Generation.CodeResult;

public class ImportDefaultWithNamespace implements ImportStatement {
    private Identifier defaultId;
    private Identifier alias;
    private String module;

    @Override
    public CodeResult generateCode() {
        return null;
    }

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
