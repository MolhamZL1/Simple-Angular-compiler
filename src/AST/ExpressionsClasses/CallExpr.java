package AST.ExpressionsClasses;

import AST.Args;

public class CallExpr implements Expression{
private Expression expression;
private Args args;

    public CallExpr(Expression expression, Args args) {
        this.expression = expression;
        this.args = args;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nCallExpr{");
        sb.append("\nexpression=").append(expression);
        if (args != null) {
            sb.append(", \nargs=").append(args);
        }
        sb.append("\n}");
        return sb.toString();
    }
}
