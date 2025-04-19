package AST.ImportsClasses;

public class ImportNamespace implements ImportStatement {
    private String alias;
    private String module;

    public ImportNamespace(String alias, String module) {
        this.alias = alias;
        this.module = module;
    }

    @Override
    public String toString() {
        return "\n import{ * as " + alias + " from '" + module + "}";
    }
}
