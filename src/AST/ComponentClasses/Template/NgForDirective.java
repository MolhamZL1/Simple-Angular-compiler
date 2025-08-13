package AST.ComponentClasses.Template;

import Code_Generation.CodeResult;

public class NgForDirective implements Directive{
    AttributeValue attributeValue;

    public NgForDirective(AttributeValue attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "NgForDirective{" +
                "attributeValue=" + attributeValue +
                '}';
    }
    @Override
    public CodeResult generateCode() {
        CodeResult result = new CodeResult("", "");
        String elId = "ngfor_" + System.nanoTime();
        result.html = "id=\"" + elId + "\"";

        String raw = attributeValue.generateJsExpression();
        if (raw.startsWith("\"") && raw.endsWith("\"") && raw.length() >= 2) raw = raw.substring(1, raw.length()-1);

        String loopVar = "item";
        String iterable = "[]";
        java.util.regex.Matcher m = java.util.regex.Pattern.compile("\\s*let\\s+(\\w+)\\s+of\\s+([^;]+)").matcher(raw);
        if (m.find()) {
            loopVar = m.group(1).trim();
            iterable = m.group(2).trim();
        } else {
            iterable = raw.trim();
        }
        // دعم [].constructor(n) → Array(n).fill(0)
        iterable = iterable.replaceAll("\\[\\]\\s*\\.\\s*constructor\\s*\\(([^)]+)\\)", "Array($1).fill(0)");

        String js =
                "(function(){\n" +
                        "  const container = document.getElementById('"+elId+"');\n" +
                        "  const __items = " + iterable + ";\n" +
                        "  if (!container) return;\n" +
                        "  for (let " + loopVar + " of (__items || [])) {\n" +
                        "    const el = document.createElement('div');\n" +
                        "    el.textContent = String(" + loopVar + ");\n" +
                        "    container.appendChild(el);\n" +
                        "  }\n" +
                        "})();\n";
        result.js = js;
        return result;
    }




}
