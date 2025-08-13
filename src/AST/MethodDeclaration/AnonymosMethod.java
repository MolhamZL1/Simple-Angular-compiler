package AST.MethodDeclaration;

import AST.ASTNode;
import AST.Args;
import AST.ExpressionsClasses.Expression;
import AST.Parameter;
import AST.Type;
import Code_Generation.CodeResult;

import java.util.List;

public class AnonymosMethod implements MethodDeclaration, Expression {
private boolean isAsync;
private List<Parameter> parameters;
private Args args;
private Type type;

    @Override
    public CodeResult generateCode() {
        return null;
    }

    private ASTNode body;

    public AnonymosMethod(boolean isAsync, List<Parameter> parameters,Args args,Type type, ASTNode body) {
        this.isAsync = isAsync;
        this.parameters = parameters;
        this.type = type;
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nDefaultMethod{")
                .append("isAsync=").append(isAsync);

        if (parameters != null) {
            sb.append(", parameters=").append(parameters);
        }


        if (args != null) {
            sb.append(", args=").append(args);
        }

        if (type != null) {
            sb.append(", type=").append(type);
        }


        sb.append(", body=").append(body)
                .append('}');

        return sb.toString();
    }
}
