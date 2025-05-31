package AST.ComponentClasses.Template;

public class NgIfDirective implements Directive{
private AttributeValue attributeValue;

    public NgIfDirective(AttributeValue attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "NgIfDirective{" +
                "attributeValue=" + attributeValue +
                '}';
    }
}
