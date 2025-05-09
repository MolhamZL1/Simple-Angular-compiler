package AST.Statement.IfStatement;

import AST.Statement.Statement;

import java.util.List;

public class IfStatement implements Statement {
private IfSection ifSection;
private List<ElseIfSection> elseIfSections;
private elseSection elseSection;

    public IfStatement(IfSection ifSection, List<ElseIfSection> elseIfSections, AST.Statement.IfStatement.elseSection elseSection) {
        this.ifSection = ifSection;
        this.elseIfSections = elseIfSections;
        this.elseSection = elseSection;
    }

    @Override
    public String toString() {
        return "\nIfStatement{" +
                "ifSection=" + ifSection +
                ", elseIfSections=" + elseIfSections +
                ", elseSection=" + elseSection +
                '}';
    }
}
