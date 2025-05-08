package AST.ExpressionsClasses;

public class PostFixExpr implements Expression{
    private Expression expression;
    private String operation;

    public PostFixExpr(Expression expression, String operation) {
        this.expression = expression;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "\nPostFixExpr{" +
                "expression=" + expression +
                ", operation='" + operation + '\'' +
                '}';
    }
}
