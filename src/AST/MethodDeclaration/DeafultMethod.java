package AST.MethodDeclaration;

import AST.ASTNode;
import AST.ExpressionsClasses.Expression;
import AST.Identifier;
import AST.Type;

import java.util.List;

public class DeafultMethod implements MethodDeclaration {
    private boolean isAsync;
    private Identifier name;
    private List<ASTNode> parameters;
    private Type type;
    private ASTNode body;

    public DeafultMethod(boolean isAsync, Identifier name, List<ASTNode> parameters, Type type, ASTNode body) {
        this.isAsync = isAsync;
        this.name = name;
        this.parameters = parameters;
        this.type = type;
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nDeafultMethod{" +
                "isAsync=" + isAsync +
                ", name=" + name +
                ", parameters=" + parameters +
                ", type=" + type +
                ", body=" + body +
                '}';
    }
}
