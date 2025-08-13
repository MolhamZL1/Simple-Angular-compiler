package AST.ImportsClasses;

import AST.Identifier;
import Code_Generation.CodeResult;

public class ImportNamespace implements ImportStatement {
    private Identifier alias;
    private String module;

    @Override
    public CodeResult generateCode() {
        return null;
    }

    public ImportNamespace(Identifier alias, String module) {
        this.alias = alias;
        this.module = module;
    }

    @Override
    public String toString() {
        return "\n import{ * as " + alias + " from '" + module + "}";
    }
}
