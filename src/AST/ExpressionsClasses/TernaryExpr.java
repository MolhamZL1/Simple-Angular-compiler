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
        return new CodeResult("","");
    }
}
