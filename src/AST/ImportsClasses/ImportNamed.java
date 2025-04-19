package AST.ImportsClasses;

import java.util.List;

public class ImportNamed implements ImportStatement {
    private List<ImportItem> items;
    private String module;

    public ImportNamed(List<ImportItem> items, String module) {
        this.items = items;
        this.module = module;
    }

    @Override
    public String toString() {
        return "\n import{" + items + " from '" + module + "}";
    }
}
