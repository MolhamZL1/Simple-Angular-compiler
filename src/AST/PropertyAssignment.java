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
        String key = (proparty == null) ? "" : proparty.getIdentifier();
        CodeResult v = (value != null) ? value.generateCode() : new CodeResult("undefined", "");
        String pair = key + ": " + (expr(v).isBlank()? "undefined" : expr(v));
        return new CodeResult(pair, (v.js == null ? "" : v.js));
    }
    private static String expr(CodeResult c){
        if (c == null) return "";
        String js = (c.js == null ? "" : c.js.trim());
        if (!js.isEmpty()) return js;              // لو العقدة أنتجت تعبير JS واضح، خُذْه
        return (c.html == null ? "" : c.html);     // وإلا خُذ النص (مثل المعرّفات والأرقام حالياً)
    }


}
