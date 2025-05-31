package AST.ComponentClasses.Template;

import AST.ComponentClasses.Template.AttributeValue;
import AST.ComponentClasses.Template.Binding;
import AST.Identifier;

public class TwoWayBinding implements Binding {
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
