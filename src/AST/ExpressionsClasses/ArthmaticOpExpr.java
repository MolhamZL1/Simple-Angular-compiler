package AST.ExpressionsClasses;

public class ArthmaticOpExpr implements Expression{
    private Expression leftExpression;
    private Expression rightExpression;
    private String op;

    public ArthmaticOpExpr(Expression leftExpression, Expression rightExpression, String op) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.op = op;
    }

    @Override
    public String toString() {
        return "\nArthmaticOpExpr{" +
                "\nleftExpression=" + leftExpression +
                "\n, rightExpression=" + rightExpression +
                "\n, op='" + op + '\'' +
                "\n}";
    }
}
