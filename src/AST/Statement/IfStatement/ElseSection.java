package AST.Statement.IfStatement;

import AST.ASTNode;
import AST.Statement.Statement;
import Code_Generation.CodeResult;

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

    @Override
    public CodeResult generateCode() {
        return null;
    }
}
