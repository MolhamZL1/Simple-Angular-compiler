package AST.ExpressionsClasses;

public class AdditionAssignmentExpr implements Expression{
    private Expression variableExpression;
    private Expression valueExpression;
    private String op;

    public AdditionAssignmentExpr(Expression variableExpression, String op, Expression valueExpression) {
        this.variableExpression = variableExpression;
        this.valueExpression = valueExpression;
        this.op = op;
    }

    @Override
    public String toString() {
        return "\nAdditionAssignmentExpr{" +
                "variableExpression=" + variableExpression +
                ", op='" + op + '\'' +
                ", valueExpression=" + valueExpression +
                '}';
    }
}
