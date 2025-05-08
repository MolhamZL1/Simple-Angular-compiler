package AST.ComponentClasses;

public class SelectorProperty implements MetadataProperty{
    String selector;

    public SelectorProperty(String selector) {
        this.selector = selector;
    }

    @Override
    public String toString() {
        return "selectorProperty{"  + selector + '}';
    }
}
