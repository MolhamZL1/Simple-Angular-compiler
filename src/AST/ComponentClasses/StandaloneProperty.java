package AST.ComponentClasses;

public class StandaloneProperty implements MetadataProperty{
    boolean standalone;

    public StandaloneProperty(boolean standalone) {
        this.standalone = standalone;
    }

    @Override
    public String toString() {
        return "standalone{" +
                 standalone +
                '}';
    }
}
