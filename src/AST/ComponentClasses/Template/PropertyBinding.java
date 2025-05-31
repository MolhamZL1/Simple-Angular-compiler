package AST.ComponentClasses.Template;

import AST.ComponentClasses.Template.AttributeValue;
import AST.ComponentClasses.Template.Binding;
import AST.Identifier;

public class PropertyBinding implements Binding {
    Identifier identifier;
    AttributeValue attributeValue;

    public PropertyBinding(Identifier identifier, AttributeValue attributeValue) {
        this.identifier = identifier;
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "PropertyBinding{" +
                "identifier=" + identifier +
                ", attributeValue=" + attributeValue +
                '}';
    }
}
