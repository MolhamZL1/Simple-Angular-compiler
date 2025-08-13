package AST.Statement.LoopStatement;

import AST.ASTNode;
import AST.ExpressionsClasses.Expression;
import AST.Statement.Statement;
import Code_Generation.CodeResult;

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
        StringBuilder sb = new StringBuilder("\nForStatement{")
                .append("initialization=").append(initialization);

        if (update != null) {
            sb.append(", update=").append(update);
        }

        if (condition != null) {
            sb.append(", condition=").append(condition);
        }

        sb.append(", body=").append(body)
                .append('}');

        return sb.toString();
    }

    @Override
    public CodeResult generateCode() {
        return null;
    }
}
