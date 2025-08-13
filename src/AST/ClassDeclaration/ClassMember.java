package AST.ClassDeclaration;

import AST.ASTNode;
import Code_Generation.CodeResult;

public class ClassMember implements ASTNode {
private AccessModifier accessModifier;
private ClassMemberModifier classMemberModifier;
private ClassStatment classStatment;

    public ClassMember(AccessModifier accessModifier, ClassMemberModifier classMemberModifier, ClassStatment classStatment) {
        this.accessModifier = accessModifier;
        this.classMemberModifier = classMemberModifier;
        this.classStatment = classStatment;
    }

    @Override
    public String toString() {
        return "\nClassMember{" +
                (accessModifier != null ? "accessModifier=" + accessModifier + ", " : "") +
                (classMemberModifier != null ? "classMemberModifier=" + classMemberModifier + ", " : "") +
                "classStatement=" + classStatment +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        return null;
    }
}
