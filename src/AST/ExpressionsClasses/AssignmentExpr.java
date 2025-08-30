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
        CodeResult l = variableExpression.generateCode();
        CodeResult r = valueExpression.generateCode();
        String expr = l.html + " = " + r.html;
        return new CodeResult(expr, (l.js==null?"":l.js) + (r.js==null?"":r.js));
    }

    private static String expr(CodeResult c){
        if (c == null) return "";
        String js = (c.js == null ? "" : c.js.trim());
        if (!js.isEmpty()) return js;              // لو العقدة أنتجت تعبير JS واضح، خُذْه
        return (c.html == null ? "" : c.html);     // وإلا خُذ النص (مثل المعرّفات والأرقام حالياً)
    }



    private static String safe(String s){ return s==null? "": s; }
}
