package AST.ImportsClasses;

public class ImportDefaultWithNamespace implements ImportStatement {
    private String defaultId;
    private String alias;
    private String module;

    public ImportDefaultWithNamespace(String defaultId, String alias, String module) {
        this.defaultId = defaultId;
        this.alias = alias;
        this.module = module;
    }

    @Override
    public String toString() {
        return "\n import{" + defaultId + ", * as " + alias + " from '" + module + "}";
    }
}
