package AST.ComponentClasses.Template;

import AST.ComponentClasses.Template.AttributeValue;
import AST.ComponentClasses.Template.Binding;
import AST.Identifier;
import Code_Generation.CodeResult;

public class TwoWayBinding implements Binding {
    Identifier identifier;
    AttributeValue attributeValue;

    public TwoWayBinding(Identifier identifier, AttributeValue attributeValue) {
        this.identifier = identifier;
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "TwoWayBinding{" +
                "identifier=" + identifier +
                ", attributeValue=" + attributeValue +
                '}';
    }
    @Override
    public CodeResult generateCode() {
        String elementId = "el_" + System.nanoTime();
        String htmlPart  = "id=\"" + elementId + "\"";

        // لازم ناخد التعبير كـ JS (مو HTML)
        String expr = attributeValue.generateJsExpression();

        String jsPart = """
    (function(){
        var el = document.getElementById('%s');
        if (!el) return;
        try {
            el.value = (%s);
        } catch(e){ /* ignore */ }
        el.addEventListener('input', function(){
            try { %s = el.value; } catch(e){ console.error(e); }
        });
    })();
    """.formatted(elementId, expr, expr);

        return new CodeResult(htmlPart, jsPart);
    }


}
