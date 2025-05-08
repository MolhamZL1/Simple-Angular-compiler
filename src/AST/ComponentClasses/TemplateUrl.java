package AST.ComponentClasses;

public class TemplateUrl implements TemplateProperty{
   private String templateUrl;

    public TemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    @Override
    public String toString() {
        return "TemplateUrl{"
               + templateUrl  +
                '}';
    }
}
