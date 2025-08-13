package AST.Statement.LoopStatement;

import AST.ExpressionsClasses.Expression;
import AST.Statement.Statement;
import Code_Generation.CodeResult;

public class WhileStatement implements LoopStatement {
private Expression condition;
private Statement body;

    public WhileStatement(Expression condition, Statement body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nWhileStatement{" +
                "condition=" + condition +
                ", body=" + body +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        return null;
    }
}
