package AST.ComponentClasses;

import AST.Identifier;

public class Binding implements Attribute{
    private Identifier identifier;
private AttributeValue attributeValue;

    public Binding(Identifier identifier, AttributeValue attributeValue) {
        this.identifier = identifier;
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "Binding{" +
                "identifier=" + identifier +
                ", attributeValue=" + attributeValue +
                '}';
    }
}
