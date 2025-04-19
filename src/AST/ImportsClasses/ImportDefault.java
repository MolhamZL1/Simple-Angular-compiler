package AST.ImportsClasses;



public class ImportDefault implements ImportStatement {
    private String name;
    private String module;

    public ImportDefault(String name, String module) {
        this.name = name;
        this.module = module;
    }

    @Override
    public String toString() {
        return "\n import{" + name + " from '" + module + "}";
    }
}
