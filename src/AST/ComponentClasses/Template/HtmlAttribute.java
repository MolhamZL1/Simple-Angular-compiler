package AST.ComponentClasses.Template;

public class HtmlAttribute implements Attribute{
    private AttributeValue attributeValue;
    private String id;

    public HtmlAttribute(AttributeValue attributeValue, String id) {
        this.attributeValue = attributeValue;
        this.id = id;
    }

    @Override
    public String toString() {
        return "HtmlAttribute{" +
                "attributeValue=" + attributeValue +
                ", id='" + id + '\'' +
                '}';
    }
}
