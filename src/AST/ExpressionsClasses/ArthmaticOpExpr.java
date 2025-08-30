package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class ArthmaticOpExpr implements Expression{
    private Expression leftExpression;
    private Expression rightExpression;
    private String op;

    public ArthmaticOpExpr(Expression leftExpression, String op, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.op = op;
    }

    @Override
    public String toString() {
        return "\nArthmaticOpExpr{" +
                "\nleftExpression=" + leftExpression +
                "\n, op='" + op + '\'' +
                "\n, rightExpression=" + rightExpression +
                "\n}";
    }

    @Override
    public CodeResult generateCode() {
        CodeResult L = leftExpression.generateCode(), R = rightExpression.generateCode();
        String a = (L.html != null && !L.html.isBlank()) ? L.html : (L.js == null ? "" : L.js);
        String b = (R.html != null && !R.html.isBlank()) ? R.html : (R.js == null ? "" : R.js);
        String expr = a + " " + op + " " + b;
        String side = (L.js == null ? "" : L.js) + (R.js == null ? "" : R.js);
        return new CodeResult(expr, side);
    }


}
