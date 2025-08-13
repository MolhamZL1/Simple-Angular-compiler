package AST.ComponentClasses.Template;

import AST.Identifier;
import Code_Generation.CodeResult;

public class EventBinding implements Binding{
    Identifier identifier;
    AttributeValue attributeValue;

    public EventBinding(Identifier identifier, AttributeValue attributeValue) {
        this.identifier = identifier;
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "EventBinding{" +
                "identifier=" + identifier +
                ", attributeValue=" + attributeValue +
                '}';
    }
    @Override
    public CodeResult generateCode() {
        String elId = "el_" + System.nanoTime();
        String htmlPart = "id=\"" + elId + "\"";
        String handler = attributeValue.generateJsExpression().replace("$event", "event");
        String jsPart =
                "document.getElementById('" + elId + "')" +
                        ".addEventListener('" + identifier.getIdentifier() + "', function(event){  try { " +
                        handler + "; } catch(e) { console.error(e); }});\n";
        return new CodeResult(htmlPart, jsPart);
    }


}
