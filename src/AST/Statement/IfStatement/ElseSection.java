package AST.Statement.IfStatement;

import AST.ASTNode;
import AST.Statement.Statement;

public class ElseSection implements ASTNode {
    private Statement body;

    public ElseSection(Statement body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nelseSection{" +
                "body=" + body +
                '}';
    }
}
