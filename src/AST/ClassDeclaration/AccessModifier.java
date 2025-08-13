package AST.ClassDeclaration;

import AST.ASTNode;
import Code_Generation.CodeResult;

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

    @Override
    public CodeResult generateCode() {
        return null;
    }
}
