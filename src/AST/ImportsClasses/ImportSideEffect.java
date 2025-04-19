package AST.ImportsClasses;

import AST.ImportsClasses.ImportStatement;

public class ImportSideEffect implements ImportStatement {
    private String module;

    public ImportSideEffect(String module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return "\n import{ " + module + "}";
    }
}
