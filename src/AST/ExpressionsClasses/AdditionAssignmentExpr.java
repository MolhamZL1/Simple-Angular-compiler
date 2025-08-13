package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class AdditionAssignmentExpr implements Expression{
    private Expression variableExpression;
    private Expression valueExpression;
    private String op;

    @Override
    public CodeResult generateCode() {
        return new CodeResult("","");
    }

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
