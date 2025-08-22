package AST;

import AST.ExpressionsClasses.Expression;
import Code_Generation.CodeResult;

public class PropertyAssignment implements ASTNode{
    private Identifier proparty;
    private Expression value;

    public PropertyAssignment(Identifier property, Expression value) {
        this.proparty = property;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nPropertyAssignment{" +
                "property=" + proparty +
                ", value=" + value +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        String key = (proparty == null) ? "" : proparty.getIdentifier(); // مثل imports أو name
        CodeResult v = value != null ? value.generateCode() : new CodeResult("undefined", "");
        // مفتاح كـ معرّف JS صالح — بدون اقتباس
        String pair = key + ": " + (v.html==null?"":v.html);
        return new CodeResult(pair, v.js==null? "": v.js);
    }
}
