package AST.Primary;

import AST.ExpressionsClasses.Expression;
import Code_Generation.CodeResult;

import java.util.List;

public class ArrayLiteral implements Primary{
    List<Expression> items;

    public ArrayLiteral(List<Expression> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ArrayLiteral{" +
                "items=" + items +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        StringBuilder html = new StringBuilder("[");
        StringBuilder js = new StringBuilder();
        boolean first = true;
        for (Expression e : items) {
            if (e == null) continue;
            CodeResult r = e.generateCode();
            if (!first) html.append(", ");
            html.append(r.html == null ? "" : r.html);
            if (r.js != null) js.append(r.js);
            first = false;
        }
        html.append("]");
        return new CodeResult(html.toString(), js.toString());
    }
}
