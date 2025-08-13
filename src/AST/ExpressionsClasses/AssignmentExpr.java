package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class AssignmentExpr implements Expression{
    private Expression variableExpression;
    private Expression valueExpression;

    public AssignmentExpr(Expression variableExpression, Expression valueExpression) {
        this.variableExpression = variableExpression;
        this.valueExpression = valueExpression;
    }

    @Override
    public String toString() {
        return "\nAssignmentExpr{" +
                "variableExpression=" + variableExpression +
                ", valueExpression=" + valueExpression +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        return new CodeResult("","");
    }
}
