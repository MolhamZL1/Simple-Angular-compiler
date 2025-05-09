package AST.ClassDeclaration;

import AST.ASTNode;

public class AccessModifier implements ASTNode {
    private String accessModifier;

    public AccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    @Override
    public String toString() {
        return "\nAccessModifier{" +
                "accessModifier='" + accessModifier + '\'' +
                '}';
    }
}
