package AST.ClassDeclaration;

import AST.ASTNode;
import Code_Generation.CodeResult;

import java.util.List;

public class ClassBody implements ASTNode {
    private List<ClassMember> classMembers;

    public ClassBody(List<ClassMember> classMembers) {
        this.classMembers = classMembers;
    }

    @Override
    public String toString() {
        return "\nClassBody{" +
                "classMembers=" + classMembers +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        StringBuilder js = new StringBuilder();
        for (ClassMember m : classMembers) {
            if (m == null) continue;
            CodeResult r = m.generateCode();
            if (r != null && r.js != null) js.append(r.js);
        }
        return new CodeResult("", js.toString());
    }
}
