package AST.ComponentClasses.Template;

import AST.Identifier;

public class EventBinding implements Binding{
    Identifier identifier;
    AttributeValue attributeValue;

    public EventBinding(Identifier identifier, AttributeValue attributeValue) {
        this.identifier = identifier;
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "EventBinding{" +
                "identifier=" + identifier +
                ", attributeValue=" + attributeValue +
                '}';
    }
}
