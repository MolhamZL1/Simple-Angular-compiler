package AST.ComponentClasses.Template;

public class TempletHTML implements TemplateProperty{
  TemplateContent templateContent;

    public TempletHTML( TemplateContent templateContent) {
        this.templateContent = templateContent;
    }

    @Override
    public String toString() {
        return "templetHTML{" +
                templateContent +
                '}';
    }
}
