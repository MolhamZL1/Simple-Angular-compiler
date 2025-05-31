package AST.ComponentClasses.Template;

import AST.ASTNode;
import AST.ExpressionsClasses.Expression;

import java.util.List;

public class Interpolation implements ASTNode {
    private Expression expression;

    public Interpolation(Expression expressions) {
        this.expression= expressions;
    }

    public Expression getExpression() {
        return expression;
    }


    @Override
    public String toString() {
        return "Interpolation{" +
                "expression=" + expression +
                '}';
    }
}
