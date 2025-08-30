package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class ParenthesizedExpr implements Expression{
   private Expression expression;

    public ParenthesizedExpr(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nParenthesizedExpr{" +
                "expression=" + expression +
                '}';
    }
    @Override
    public CodeResult generateCode() {
        CodeResult c = expression.generateCode();
        String inner = (c.html != null && !c.html.isBlank()) ? c.html : (c.js == null ? "" : c.js);
        return new CodeResult("(" + inner + ")", c.js == null ? "" : c.js);
    }

}
