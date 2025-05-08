package AST.ComponentClasses;

public class TempletHTML implements TemplateProperty{
    HTML html;

    public TempletHTML(HTML html) {
        this.html = html;
    }

    @Override
    public String toString() {
        return "templetHTML{" +
                html +
                '}';
    }
}
