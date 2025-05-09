package AST.Statement.LoopStatement;

import AST.ASTNode;
import AST.ExpressionsClasses.Expression;
import AST.Statement.Statement;

public class ForStatement implements LoopStatement{
    private ASTNode initialization;
    private Expression update;
    private Expression condition;
    private Statement body;

    public ForStatement(ASTNode initialization, Expression update, Expression condition, Statement body) {
        this.initialization = initialization;
        this.update = update;
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nForStatement{" +
                "initialization=" + initialization +
                ", update=" + update +
                ", condition=" + condition +
                ", body=" + body +
                '}';
    }
}
