package AST.Statement.LoopStatement;

import AST.Identifier;
import AST.Statement.Statement;
import Code_Generation.CodeResult;

public class LoopControlStatement implements Statement {
private String controlKeyword;


    public LoopControlStatement(String controlKeyword) {
        this.controlKeyword = controlKeyword;

    }

    @Override
    public String toString() {
        return "\nLoopControlStatement{" +
                "controlKeyword='" + controlKeyword + '\'' +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        String t = controlKeyword==null? "" : controlKeyword.trim();
        if (!t.endsWith(";")) t = t + ";";
        return new CodeResult("", t + "\n");
    }
}
