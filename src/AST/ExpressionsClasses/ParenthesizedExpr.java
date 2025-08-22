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
        String v = c.js.isEmpty()?c.html:c.js;
        String js = "(" + v + ")";
        return new CodeResult(js, js);
    }

}
