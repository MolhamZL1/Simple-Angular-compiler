package AST.ExpressionsClasses;

public class RelationalExpr implements Expression{
    private Expression leftExpression;
    private Expression rightExpression;
    private String op;

    public RelationalExpr(Expression leftExpression, String op, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.op = op;
    }

    @Override
    public String toString() {
        return "\nRelationalExpr{" +
                "\nleftExpression=" + leftExpression +
                "\n, op='" + op + '\'' +
                "\n, rightExpression=" + rightExpression +

                "\n}";
    }
}
