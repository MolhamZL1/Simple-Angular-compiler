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
        CodeResult v   = (variableExpression != null) ? variableExpression.generateCode() : new CodeResult("", "");
        CodeResult val = (valueExpression    != null) ? valueExpression.generateCode()    : new CodeResult("", "");
        String assignment = expr(v) + " " + op + " " + expr(val);
        return new CodeResult(assignment, safe(v.js) + safe(val.js));
    }
    private static String expr(CodeResult c){
        if (c == null) return "";
        String js = (c.js == null ? "" : c.js.trim());
        if (!js.isEmpty()) return js;              // لو العقدة أنتجت تعبير JS واضح، خُذْه
        return (c.html == null ? "" : c.html);     // وإلا خُذ النص (مثل المعرّفات والأرقام حالياً)
    }



    private static String safe(String s){ return s==null? "": s; }
}
