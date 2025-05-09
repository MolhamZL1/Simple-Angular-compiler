package AST.MethodDeclaration;

import AST.ASTNode;
import AST.ExpressionsClasses.Expression;
import AST.Type;

import java.util.List;

public class AnonymosMethod implements MethodDeclaration, Expression {
private boolean isAsync;
private List<ASTNode> parameters;
private Type type;
private ASTNode body;

    public AnonymosMethod(boolean isAsync, List<ASTNode> parameters, Type type, ASTNode body) {
        this.isAsync = isAsync;
        this.parameters = parameters;
        this.type = type;
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nAnonymosMethod{" +
                "isAsync=" + isAsync +
                ", parameters=" + parameters +
                ", type=" + type +
                ", body=" + body +
                '}';
    }
}
