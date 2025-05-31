package AST.ComponentClasses;

import AST.Identifier;

public class TwoWayBinding implements Binding{
    Identifier identifier;
    AttributeValue attributeValue;

    public TwoWayBinding(Identifier identifier, AttributeValue attributeValue) {
        this.identifier = identifier;
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "TwoWayBinding{" +
                "identifier=" + identifier +
                ", attributeValue=" + attributeValue +
                '}';
    }
}
