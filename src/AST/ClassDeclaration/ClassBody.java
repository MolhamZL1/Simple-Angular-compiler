package AST.ClassDeclaration;

import AST.ASTNode;

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
}
