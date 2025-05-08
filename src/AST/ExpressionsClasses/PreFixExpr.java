package AST.ExpressionsClasses;

public class PreFixExpr implements Expression{
    private Expression expression;
    private String operation;

    public PreFixExpr(Expression expression, String operation) {
        this.expression = expression;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "\nPreFixExpr{" +
                "expression=" + expression +
                ", operation='" + operation + '\'' +
                '}';
    }
}
