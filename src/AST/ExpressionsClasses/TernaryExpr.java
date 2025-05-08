package AST.ExpressionsClasses;

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
}
