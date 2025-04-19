package AST.ImportsClasses;

public class ImportItem {
    private String original;
    private String alias;

    public ImportItem(String original, String alias) {
        this.original = original;
        this.alias = alias;
    }

    @Override
    public String toString() {
        return alias != null ? original + " as " + alias : original;
    }
}
