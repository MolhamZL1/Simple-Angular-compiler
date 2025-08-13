package AST.ComponentClasses.Template;

import Code_Generation.CodeResult;

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
    // استبدل generateCode() في HtmlAttribute.java
// HtmlAttribute.java
    @Override
    public CodeResult generateCode() {
        if (attributeValue == null) return new CodeResult(id, "");
        String name = id;
        String valHtml = attributeValue.generateCode().html;
        boolean isInterpolated = valHtml.isEmpty(); // لأننا رجّعنا "" مع الـ interpolation

        if (isInterpolated) {
            String elId = "el_" + System.nanoTime();
            String htmlPart = "id=\"" + elId + "\"";
            String expr = attributeValue.generateJsExpression()
                    .replace("produc.", "product."); // تصليح سريع لغلطة شائعة

            String jsPart =
                    "var __el = document.getElementById('" + elId + "');\n" +
                            "if(__el){\n" +
                            // خصائص شائعة نعيّنها مباشرة
                            (name.equals("src") || name.equals("href") || name.equals("value")
                                    ? "  __el."+name+" = String(__val(" + expr + "));\n"
                                    : "  __el.setAttribute('"+name+"', String(__val(" + expr + "))); \n") +
                            "}\n";
            return new CodeResult(htmlPart, jsPart);
        } else {
            return new CodeResult(name + "=\"" + valHtml + "\"", "");
        }
    }

}
