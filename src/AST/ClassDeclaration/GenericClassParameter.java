package AST.ClassDeclaration;

import AST.ASTNode;
import AST.Identifier;
import Code_Generation.CodeResult;

public class GenericClassParameter implements ASTNode {
private Identifier parameter;
private Identifier parent;

    public GenericClassParameter(Identifier parameter, Identifier parent) {
        this.parameter = parameter;
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "\nGenericClassParameters{" +
                "parameter=" + parameter +
                ", parent=" + parent +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        // Generic type params are compile-time only; no runtime output.
        return new CodeResult("", "");
    }
}
