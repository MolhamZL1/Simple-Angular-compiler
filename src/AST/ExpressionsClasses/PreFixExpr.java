package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class PreFixExpr implements Expression{
    private Expression expression;
    private String operation;

    public PreFixExpr(Expression expression, String operation) {
        this.expression = expression;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "\nPreFixExpr{" +
                "expression=" + expression +
                ", operation='" + operation + '\'' +
                '}';
    }
    private static String safe(String s){ return s==null? "": s; }

    @Override
    public CodeResult generateCode() {
        CodeResult r = expression != null ? expression.generateCode() : new CodeResult("", "");
        String expr = operation + (r.html==null?"":r.html);
        return new CodeResult(expr, safe(r.js));
    }
}
