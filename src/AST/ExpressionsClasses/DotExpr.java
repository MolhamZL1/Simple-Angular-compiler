package AST.ExpressionsClasses;

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
}
