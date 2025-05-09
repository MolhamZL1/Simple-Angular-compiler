package AST.Statement.LoopStatement;

import AST.ExpressionsClasses.Expression;
import AST.Identifier;
import AST.Statement.Statement;

public class ForOfStatement implements LoopStatement{
    private Identifier item;
    private Expression items;
    private Statement body;

    public ForOfStatement(Identifier item, Expression items, Statement body) {
        this.item = item;
        this.items = items;
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nForOfStatement{" +
                "item=" + item +
                ", items=" + items +
                ", body=" + body +
                '}';
    }
}
