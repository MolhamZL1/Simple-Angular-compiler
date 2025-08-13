package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class UnaryExpr implements Expression{
    private Expression expression;
    private String op;

    public UnaryExpr(Expression expression, String op) {
        this.expression = expression;
        this.op = op;
    }

    @Override
    public String toString() {
        return "\nUnaryExpr{" +
                "\nexpression=" + expression +
                ", op='" + op + '\'' +
                "\n}";
    }

    @Override
    public CodeResult generateCode() {
        return new CodeResult("","");
    }
}
