package AST.Primary;

import Code_Generation.CodeResult;

import java.util.List;

public class MapLitral implements Primary{
   private List<Mapmember> items;

    public MapLitral(List<Mapmember> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "\nMapLitral{" +
                "items=" + items +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        StringBuilder html = new StringBuilder("{");
        StringBuilder js = new StringBuilder();
        boolean first = true;
        for (Mapmember m : items) {
            if (m == null) continue;
            CodeResult r = m.generateCode();
            if (!first) html.append(", ");
            html.append(r.html);
            if (r.js != null) js.append(r.js);
            first = false;
        }
        html.append("}");
        return new CodeResult(html.toString(), js.toString());
    }
}
