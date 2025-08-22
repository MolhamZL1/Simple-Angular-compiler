package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class TernaryExpr implements Expression{
    private Expression conditionExpr;
    private Expression trueExpr;
    private Expression falseExpr;

    public TernaryExpr(Expression conditionExpr, Expression trueExpr, Expression falseExpr) {
        this.conditionExpr = conditionExpr;
        this.trueExpr = trueExpr;
        this.falseExpr = falseExpr;
    }

    @Override
    public String toString() {
        return "\nTernaryExpr{" +
                "conditionExpr=" + conditionExpr +
                ", trueExpr=" + trueExpr +
                ", falseExpr=" + falseExpr +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        CodeResult c = conditionExpr != null ? conditionExpr.generateCode() : new CodeResult("false","");
        CodeResult t = trueExpr  != null ? trueExpr.generateCode()  : new CodeResult("undefined","");
        CodeResult f = falseExpr != null ? falseExpr.generateCode() : new CodeResult("undefined","");
        String expr = "(" + c.html + ") ? (" + t.html + ") : (" + f.html + ")";
        return new CodeResult(expr, safe(c.js)+safe(t.js)+safe(f.js));
    }

    private static String safe(String s){ return s==null? "": s; }
}
