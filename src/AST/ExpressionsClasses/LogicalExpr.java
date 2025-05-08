package AST.ExpressionsClasses;

public class LogicalExpr implements Expression{
    private Expression leftExpression;
    private Expression rightExpression;
    private String op;

    public LogicalExpr(Expression leftExpression, Expression rightExpression, String op) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.op = op;
    }

    @Override
    public String toString() {
        return "\nLogicalExpr{" +
                "\nleftExpression=" + leftExpression +
                "\n, rightExpression=" + rightExpression +
                "\n, op='" + op + '\'' +
                "\n}";
    }
}
