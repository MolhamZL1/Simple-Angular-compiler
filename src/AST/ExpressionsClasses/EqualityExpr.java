package AST.ExpressionsClasses;

public class EqualityExpr implements Expression{
    private Expression leftExpression;
    private Expression rightExpression;
    private String op;

    public EqualityExpr(Expression leftExpression, Expression rightExpression, String op) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.op = op;
    }
    @Override
    public String toString() {
        return "\nEqualityExpr{" +
                "\nleftExpression=" + leftExpression +
                "\n, rightExpression=" + rightExpression +
                "\n, op='" + op + '\'' +
                "\n}";
    }
}
