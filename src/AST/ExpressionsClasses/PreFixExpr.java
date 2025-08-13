package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

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

    @Override
    public CodeResult generateCode() {
        return new CodeResult("","");
    }
}
