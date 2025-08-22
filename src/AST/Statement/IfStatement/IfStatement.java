package AST.Statement.IfStatement;

import AST.Statement.Statement;
import Code_Generation.CodeResult;

import java.util.List;

public class IfStatement implements Statement {
private IfSection ifSection;
private List<ElseIfSection> elseIfSections;
private ElseSection elseSection;

    public IfStatement(IfSection ifSection, List<ElseIfSection> elseIfSections, ElseSection elseSection) {
        this.ifSection = ifSection;
        this.elseIfSections = elseIfSections;
        this.elseSection = elseSection;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IfStatement{")
                .append("ifSection=").append(ifSection);

        if (elseIfSections != null) {
            sb.append(", elseIfSections=").append(elseIfSections);
        }
        if (elseSection != null) {
            sb.append(", elseSection=").append(elseSection);
        }

        return sb.append('}').toString();
    }
    @Override
    public CodeResult generateCode() {
        StringBuilder js = new StringBuilder();
        if (ifSection != null) js.append(ifSection.generateCode().js);
        if (elseIfSections != null) {
            for (ElseIfSection e : elseIfSections) if (e != null) js.append(e.generateCode().js);
        }
        if (elseSection != null) js.append(elseSection.generateCode().js);
        return new CodeResult("", js.toString());
    }
}
