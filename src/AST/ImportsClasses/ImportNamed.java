package AST.ImportsClasses;

import Code_Generation.CodeResult;

import java.util.List;

public class ImportNamed implements ImportStatement {
    private List<ImportItem> items;
    private String module;

    @Override
    public CodeResult generateCode() {
        return null;
    }

    public ImportNamed(List<ImportItem> items, String module) {
        this.items = items;
        this.module = module;
    }

    @Override
    public String toString() {
        return "\n import{" + items + " from '" + module + "}";
    }
}
