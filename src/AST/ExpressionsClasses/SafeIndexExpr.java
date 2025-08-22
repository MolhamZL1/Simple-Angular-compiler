package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class SafeIndexExpr implements Expression{
    private Expression baseObject;
    private Expression indexObject;

    public SafeIndexExpr(Expression baseObject, Expression indexObject) {
        this.baseObject = baseObject;
        this.indexObject = indexObject;
    }

    @Override
    public String toString() {
        return "\nSafeIndexExpr{" +
                "baseObject=" + baseObject +
                ", indexObject=" + indexObject +
                '}';
    }


    @Override
    public CodeResult generateCode() {
        CodeResult b = baseObject != null ? baseObject.generateCode() : new CodeResult("undefined", "");
        CodeResult i = indexObject != null ? indexObject.generateCode() : new CodeResult("0", "");
        String expr = "((" + b.html + ")==null?undefined:(" + b.html + ")[" + i.html + "])";
        return new CodeResult(expr, safe(b.js)+safe(i.js));
    }

    private static String safe(String s){ return s==null? "": s; }
}
