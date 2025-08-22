package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class AdditionAssignmentExpr implements Expression{
    private Expression variableExpression;
    private Expression valueExpression;
    private String op;



    public AdditionAssignmentExpr(Expression variableExpression, String op, Expression valueExpression) {
        this.variableExpression = variableExpression;
        this.valueExpression = valueExpression;
        this.op = op;
    }

    @Override
    public String toString() {
        return "\nAdditionAssignmentExpr{" +
                "variableExpression=" + variableExpression +
                ", op='" + op + '\'' +
                ", valueExpression=" + valueExpression +
                '}';
    }
    @Override
    public CodeResult generateCode() {
        CodeResult v = variableExpression != null ? variableExpression.generateCode() : new CodeResult("", "");
        CodeResult val = valueExpression    != null ? valueExpression.generateCode()    : new CodeResult("", "");
        String expr = (v.html==null?"":v.html) + " " + op + " " + (val.html==null?"":val.html);
        return new CodeResult(expr, safe(v.js)+safe(val.js));
    }

    private static String safe(String s){ return s==null? "": s; }
}
