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
        String htmlPart = "id=\"" + elementId + "\"";
        String value = attributeValue.generateCode().html;
        String jsPart = """
        (function(){
            var el = document.getElementById('%s');
            el.value = %s;
            el.addEventListener('input', function(){
                %s = el.value;
            });
        })();
        """.formatted(elementId, value, value);
        return new CodeResult(htmlPart, jsPart);
    }

}
