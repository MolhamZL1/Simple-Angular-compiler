package AST.Statement.LoopStatement;

import AST.Identifier;
import AST.Statement.Statement;

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
}
