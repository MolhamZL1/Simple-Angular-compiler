package AST.Statement;

import Code_Generation.CodeResult;

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

    @Override
    public CodeResult generateCode() {
        StringBuilder js = new StringBuilder();
        if (statements != null) {
            for (Statement s : statements) {
                if (s == null) continue;
                CodeResult r = s.generateCode();
                if (r != null && r.js != null) js.append(r.js);
            }
        }
        return new CodeResult("", js.toString());
    }
}
