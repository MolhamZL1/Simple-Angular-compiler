package AST;

import AST.ExpressionsClasses.Expression;

import java.util.List;

public class Args implements ASTNode{
    List<Expression> expressions;

    public Args(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "\nArgs{" +
                 expressions +
                '}';
    }
}
