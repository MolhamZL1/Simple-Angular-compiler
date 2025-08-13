package AST.ImportsClasses;

import AST.ImportsClasses.ImportStatement;
import Code_Generation.CodeResult;

public class ImportSideEffect implements ImportStatement {
    private String module;

    @Override
    public CodeResult generateCode() {
        return null;
    }

    public ImportSideEffect(String module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return "\n import{ " + module + "}";
    }
}
