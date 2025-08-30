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
        String le = (L.html != null && !L.html.isBlank()) ? L.html : (L.js == null ? "" : L.js);
        String re = (R.html != null && !R.html.isBlank()) ? R.html : (R.js == null ? "" : R.js);
        String expr = le + "." + re;
        String side = (L.js == null ? "" : L.js) + (R.js == null ? "" : R.js);
        return new CodeResult(expr, side);
    }


}
