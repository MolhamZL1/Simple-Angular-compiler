package AST.ExpressionsClasses;

public class AdditionAssignmentExpr implements Expression{
    private Expression variableExpression;
    private Expression valueExpression;
    private String op;

    public AdditionAssignmentExpr(Expression variableExpression, Expression valueExpression, String op) {
        this.variableExpression = variableExpression;
        this.valueExpression = valueExpression;
        this.op = op;
    }

    @Override
    public String toString() {
        return "\nAdditionAssignmentExpr{" +
                "variableExpression=" + variableExpression +
                ", valueExpression=" + valueExpression +
                ", op='" + op + '\'' +
                '}';
    }
}
