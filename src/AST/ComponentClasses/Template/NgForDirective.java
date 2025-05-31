package AST.ComponentClasses.Template;

public class NgForDirective implements Directive{
    AttributeValue attributeValue;

    public NgForDirective(AttributeValue attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "NgForDirective{" +
                "attributeValue=" + attributeValue +
                '}';
    }
}
