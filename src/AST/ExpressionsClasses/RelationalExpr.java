package AST.ExpressionsClasses;

public class RelationalExpr implements Expression{
    private Expression leftExpression;
    private Expression rightExpression;
    private String op;

    public RelationalExpr(Expression leftExpression, Expression rightExpression, String op) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.op = op;
    }

    @Override
    public String toString() {
        return "\nRelationalExpr{" +
                "\nleftExpression=" + leftExpression +
                "\n, rightExpression=" + rightExpression +
                "\n, op='" + op + '\'' +
                "\n}";
    }
}
