package AST.ComponentClasses;

import Code_Generation.CodeResult;

public class SelectorProperty implements MetadataProperty{
    String selector;

    public SelectorProperty(String selector) {
        this.selector = selector;
    }

    @Override
    public String toString() {
        return "selectorProperty{"  + selector + '}';
    }

    @Override
    public CodeResult generateCode() {
        return null;
    }
}
