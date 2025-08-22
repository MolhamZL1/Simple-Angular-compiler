package AST.ExpressionsClasses;

import AST.Identifier;
import Code_Generation.CodeResult;

public class SafeNavExpr implements Expression{
    private Expression baseObject;
    private Identifier id;

    public SafeNavExpr(Expression baseObject, Identifier id) {
        this.baseObject = baseObject;
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nSafeNavExpr{" +
                "baseObject=" + baseObject +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        CodeResult b = baseObject != null ? baseObject.generateCode() : new CodeResult("undefined", "");
        String prop = (id == null) ? "" : id.getIdentifier();
        String expr = "((" + b.html + ")==null?undefined:(" + b.html + ")." + prop + ")";
        return new CodeResult(expr, safe(b.js));
    }

    private static String safe(String s){ return s==null? "": s; }
}
