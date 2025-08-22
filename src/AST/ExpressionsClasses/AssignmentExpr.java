package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class AssignmentExpr implements Expression{
    private Expression variableExpression;
    private Expression valueExpression;

    public AssignmentExpr(Expression variableExpression, Expression valueExpression) {
        this.variableExpression = variableExpression;
        this.valueExpression = valueExpression;
    }

    @Override
    public String toString() {
        return "\nAssignmentExpr{" +
                "variableExpression=" + variableExpression +
                ", valueExpression=" + valueExpression +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        CodeResult v = variableExpression != null ? variableExpression.generateCode() : new CodeResult("", "");
        CodeResult val = valueExpression != null ? valueExpression.generateCode()   : new CodeResult("", "");
        String expr = (v.html==null?"":v.html) + " = " + (val.html==null?"":val.html);
        return new CodeResult(expr, safe(v.js)+safe(val.js));
    }

    private static String safe(String s){ return s==null? "": s; }
}
