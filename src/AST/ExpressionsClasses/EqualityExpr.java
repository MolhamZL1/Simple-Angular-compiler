package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class EqualityExpr implements Expression{
    private Expression leftExpression;
    private Expression rightExpression;
    private String op;

    public EqualityExpr(Expression leftExpression, String op ,Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.op = op;
    }
    @Override
    public String toString() {
        return "\nEqualityExpr{" +
                "\nleftExpression=" + leftExpression +
                "\n, op='" + op + '\'' +
                "\n, rightExpression=" + rightExpression +

                "\n}";
    }

    @Override
    public CodeResult generateCode() {
        return new CodeResult("","");
    }
}
