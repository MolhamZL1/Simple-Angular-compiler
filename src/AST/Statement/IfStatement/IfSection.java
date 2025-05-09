package AST.Statement.IfStatement;

import AST.ASTNode;
import AST.ExpressionsClasses.Expression;
import AST.Statement.Statement;

public class IfSection implements ASTNode {
private Expression condition;
private Statement body;

    public IfSection(Expression condition, Statement body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nIfSection{" +
                "condition=" + condition +
                ", body=" + body +
                '}';
    }
}
