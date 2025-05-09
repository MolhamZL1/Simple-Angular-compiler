package AST.Statement;

import java.util.List;

public class BlockStatement implements Statement{
    List<Statement> statements;

    public BlockStatement(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "\nBlockStatement{" +
                "statements=" + statements +
                '}';
    }
}
