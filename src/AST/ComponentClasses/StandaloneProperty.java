package AST.ComponentClasses;

import Code_Generation.CodeResult;

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

    @Override
    public CodeResult generateCode() {
        return new CodeResult("","");
    }
}
