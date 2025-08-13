package AST.ComponentClasses.Template;

import Code_Generation.CodeResult;

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
    public CodeResult generateCode() {
        CodeResult result = new CodeResult("","");
        if (templateContent != null) {
            // استدعي generateCode الخاص بالـ templateContent عشان يرجع الكود منفصل
            CodeResult contentCode = templateContent.generateCode();
            result.html = contentCode.html;
            result.js = contentCode.js;
        } else {
            result.html = "";
            result.js = "";
        }
        return result;
    }

}
