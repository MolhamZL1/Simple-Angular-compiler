package AST.ExpressionsClasses;

public class ParenthesizedExpr implements Expression{
   private Expression expression;

    public ParenthesizedExpr(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nParenthesizedExpr{" +
                "expression=" + expression +
                '}';
    }
}
