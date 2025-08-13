package AST.ComponentClasses.Template;

import AST.ComponentClasses.Template.AttributeValue;
import AST.ComponentClasses.Template.Binding;
import AST.Identifier;
import Code_Generation.CodeResult;

public class PropertyBinding implements Binding {
    Identifier identifier;
    AttributeValue attributeValue;

    public PropertyBinding(Identifier identifier, AttributeValue attributeValue) {
        this.identifier = identifier;
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "PropertyBinding{" +
                "identifier=" + identifier +
                ", attributeValue=" + attributeValue +
                '}';
    }
    @Override
    public CodeResult generateCode() {
        String elId = "el_" + System.nanoTime();
        String name = identifier.getIdentifier();
        String expr = attributeValue.generateJsExpression();
        StringBuilder js = new StringBuilder();
        js.append("var __el = document.getElementById('").append(elId).append("');\n");
        js.append("if(__el){\n");
        if ("ngClass".equals(name)) {
            js.append("  (function(v){ if(typeof v==='string'){ __el.classList.add(...v.split(/\\s+/).filter(Boolean)); }\n")
                    .append("    else if(Array.isArray(v)){ __el.classList.add(...v); }\n")
                    .append("    else if(v && typeof v==='object'){ for (var k in v){ if(v[k]) __el.classList.add(k); else __el.classList.remove(k);} }\n")
                    .append("  })(").append(expr).append(");\n");
        } else if ("ngStyle".equals(name)) {
            js.append("  Object.assign(__el.style, (").append(expr).append(")||{});\n");
        } else if ("disabled".equals(name)) {
            js.append("  __el.disabled = !!(").append(expr).append(");\n");
        } else {
            js.append("  __el.").append(name).append(" = ").append(expr).append(";\n");
        }
        js.append("}\n");
        return new CodeResult("id=\"" + elId + "\"", js.toString());
    }

}
