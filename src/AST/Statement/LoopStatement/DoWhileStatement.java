package AST.Statement.LoopStatement;

import AST.ExpressionsClasses.Expression;
import AST.Statement.Statement;
import Code_Generation.CodeResult;

public class DoWhileStatement implements LoopStatement{
    private Expression condition;
    private Statement body;

    public DoWhileStatement(Expression condition, Statement body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        return "\ndoWhileStatement{" +
                "condition=" + condition +
                ", body=" + body +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        return null;
    }
}
