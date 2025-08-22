package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class PostFixExpr implements Expression{
    private Expression expression;
    private String operation;

    public PostFixExpr(Expression expression, String operation) {
        this.expression = expression;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "\nPostFixExpr{" +
                "expression=" + expression +
                ", operation='" + operation + '\'' +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        CodeResult r = expression != null ? expression.generateCode() : new CodeResult("", "");
        String expr = (r.html==null?"":r.html) + operation;
        return new CodeResult(expr, safe(r.js));
    }

    private static String safe(String s){ return s==null? "": s; }
}
