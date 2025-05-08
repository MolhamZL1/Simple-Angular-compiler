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
        return "\nCallExpr{" +
                "\nexpression=" + expression +
                ", \nargs=" + args +
                "\n}";
    }
}
