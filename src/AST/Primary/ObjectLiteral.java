package AST.Primary;

import AST.PropertyAssignment;
import Code_Generation.CodeResult;

import java.util.List;

public class ObjectLiteral implements Primary{
    List<PropertyAssignment> properties;

    public ObjectLiteral(List<PropertyAssignment> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "\nObjectLiteral{" +
                "properties=" + properties +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        StringBuilder html = new StringBuilder("{");
        StringBuilder js = new StringBuilder();
        boolean first = true;
        for (PropertyAssignment p : properties) {
            if (p == null) continue;
            CodeResult r = p.generateCode();
            if (!first) html.append(", ");
            html.append(r.html);
            if (r.js != null) js.append(r.js);
            first = false;
        }
        html.append("}");
        return new CodeResult(html.toString(), js.toString());
    }
}
