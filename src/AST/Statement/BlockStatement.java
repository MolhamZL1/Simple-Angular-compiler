package AST.Statement;

import AST.ASTNode;
import Code_Generation.CodeResult;

import java.util.List;

public class BlockStatement implements Statement{
    List<ASTNode> statements;

    public BlockStatement(List<ASTNode> statements) {
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
        for (ASTNode s : statements) {
            CodeResult r = s.generateCode();
            if (r.js != null) js.append(r.js);
        }
        return new CodeResult("", js.toString());
    }

}
