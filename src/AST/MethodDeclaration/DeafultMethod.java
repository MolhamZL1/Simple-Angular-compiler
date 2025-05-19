package AST.MethodDeclaration;

import AST.*;
import AST.ExpressionsClasses.Expression;

import java.util.List;

public class DeafultMethod implements MethodDeclaration {
    private boolean isAsync;
    private Identifier name;
    private List<Parameter> parameters;

    private Args args;
    private Type type;
    private ASTNode body;

    public DeafultMethod(boolean isAsync, Identifier name, List<Parameter> parameters,Args args, Type type, ASTNode body) {
        this.isAsync = isAsync;
        this.name = name;
        this.parameters = parameters;
        this.args=args;
        this.type = type;
        this.body = body;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nDefaultMethod{")
                .append("isAsync=").append(isAsync)
                .append(", name=").append(name);

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
