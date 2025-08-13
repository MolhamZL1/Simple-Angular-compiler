package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class DotExpr implements Expression{
    private Expression left;
    private Expression right;

    public DotExpr(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "\nDotExpr{" +
                "\nleft=" + left +
                "\n, right=" + right +
                "\n}";
    }

    @Override
    public CodeResult generateCode() {
        CodeResult L = left.generateCode(), R = right.generateCode();
        String js = (L.js.isEmpty()?L.html:L.js) + "." + (R.js.isEmpty()?R.html:R.js);
        return new CodeResult(js, js);
    }

}
