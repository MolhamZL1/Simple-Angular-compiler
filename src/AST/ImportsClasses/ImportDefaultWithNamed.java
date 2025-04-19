package AST.ImportsClasses;

import java.util.List;

public class ImportDefaultWithNamed implements ImportStatement {
    private String defaultId;
    private List<ImportItem> items;
    private String module;

    public ImportDefaultWithNamed(String defaultId, List<ImportItem> items, String module) {
        this.defaultId = defaultId;
        this.items = items;
        this.module = module;
    }

    @Override
    public String toString() {
        return "\n import{" + defaultId + ", " + items + " from '" + module + "}";
    }
}
