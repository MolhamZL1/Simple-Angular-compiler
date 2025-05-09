package AST.Statement.IfStatement;

import AST.ASTNode;
import AST.ExpressionsClasses.Expression;
import AST.Statement.Statement;

public class ElseIfSection implements ASTNode {
    private Expression condition;
    private Statement body;

    public ElseIfSection(Expression condition, Statement body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nElseIfSection{" +
                "condition=" + condition +
                ", body=" + body +
                '}';
    }
}
