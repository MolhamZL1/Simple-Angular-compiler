package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

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

    @Override
    public CodeResult generateCode() {
        return new CodeResult("","");
    }
}
