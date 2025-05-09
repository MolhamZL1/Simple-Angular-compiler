package AST.Statement.IfStatement;

import AST.ASTNode;
import AST.Statement.Statement;

public class elseSection implements ASTNode {
    private Statement body;

    public elseSection(Statement body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nelseSection{" +
                "body=" + body +
                '}';
    }
}
