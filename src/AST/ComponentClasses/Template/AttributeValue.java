package AST.ComponentClasses.Template;

import AST.ASTNode;
import Code_Generation.CodeResult;

public class AttributeValue implements ASTNode {
private Interpolation interpolation;
private String value;

    public AttributeValue(Interpolation interpolation, String value) {
        this.interpolation = interpolation;
        this.value = value;
    }
    // + داخل AttributeValue.java
    public String generateJsExpression() {
        if (interpolation != null) return interpolation.asJsExpression();
        if (value == null) return "undefined";
        if (value.matches(".*[\\.\\[\\]\\(\\)><=!&|+\\-/*?:].*")) return value; // تعبير
        if (value.matches("[+-]?\\d+(?:\\.\\d+)?") || value.equals("true") || value.equals("false") || value.equals("null")) return value;
        return "\"" + value.replace("\\","\\\\").replace("\"","\\\"").replace("\n","\\n") + "\"";
    }

    @Override
    public CodeResult generateCode() {
        if (interpolation != null) {
            return new CodeResult("", "");
        }

        if (value == null) {
            return new CodeResult("", "");
        }

        // امنع double-quote escaping
        String lit = value.replace("\"","")
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");

        return new CodeResult(lit, "");
    }

    @Override
    public String toString() {
        return "AttributeValue{" +
                "interpolation=" + (interpolation != null ? interpolation.toString() : "null") +
                ", value='" + (value != null ? value : "null") + '\'' +
                '}';
    }

}
