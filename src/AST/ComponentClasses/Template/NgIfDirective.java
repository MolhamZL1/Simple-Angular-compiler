package AST.ComponentClasses.Template;

import Code_Generation.CodeResult;

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
    @Override
    public CodeResult generateCode() {
        String elementId = "ngif_" + System.nanoTime();
        String expr = attributeValue.generateJsExpression(); // أهم تعديل

        String htmlPart = " id=\"" + elementId + "\""; // لا نطبع ngIf attribute إطلاقاً
        String jsPart = """
    (function(){
      var el = document.getElementById('%s');
      if (!(%s) && el) el.style.display = 'none';
    })();
    """.formatted(elementId, expr);

        return new CodeResult(htmlPart, jsPart);
    }



}
