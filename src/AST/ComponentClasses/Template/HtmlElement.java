package AST.ComponentClasses.Template;

import AST.ASTNode;
import AST.Identifier;

import java.util.List;

public class HtmlElement implements ASTNode {
    private Identifier tagname;
    private List<Attribute> attributes;
    private TemplateContent templateContent;

    public HtmlElement(Identifier tagname, List<Attribute> attributes, TemplateContent templateContent) {
        this.tagname = tagname;
        this.attributes = attributes;
        this.templateContent = templateContent;
    }

    @Override
    public String toString() {
        return "HtmlElement{" +
                "tagname=" + tagname +
                ", attributes=" + attributes +
                ", templateContent=" + templateContent +
                '}';
    }
}
