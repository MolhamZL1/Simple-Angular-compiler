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
        String a = L.js.isEmpty()?L.html:L.js;
        String b = R.js.isEmpty()?R.html:R.js;
        String js = a + " " + op + " " + b;
        return new CodeResult(js, js);
    }

}
