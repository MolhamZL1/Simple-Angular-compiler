package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class UnaryExpr implements Expression{
    private Expression expression;
    private String op;

    public UnaryExpr(Expression expression, String op) {
        this.expression = expression;
        this.op = op;
    }

    @Override
    public String toString() {
        return "\nUnaryExpr{" +
                "\nexpression=" + expression +
                ", op='" + op + '\'' +
                "\n}";
    }
    @Override
    public CodeResult generateCode() {
        CodeResult e = expression != null ? expression.generateCode() : new CodeResult("", "");
        String exprJs = op + "(" + (e.html == null ? "" : e.html) + ")";
        return new CodeResult(exprJs, safe(e.js));
    }

    private static String safe(String s){ return s==null? "": s; }
}
