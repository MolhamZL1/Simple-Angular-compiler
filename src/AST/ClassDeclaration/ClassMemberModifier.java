package AST.ClassDeclaration;

import AST.ASTNode;
import Code_Generation.CodeResult;

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

    @Override public CodeResult generateCode() { return new CodeResult("",""); }

}
