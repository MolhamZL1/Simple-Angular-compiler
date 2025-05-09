package AST.ClassDeclaration;

import AST.ASTNode;

public class ClassMemberModifier implements ASTNode {
    private String modifier;

    public ClassMemberModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public String toString() {
        return "\nClassMemberModifier{" +
                "modifier='" + modifier + '\'' +
                '}';
    }
}
