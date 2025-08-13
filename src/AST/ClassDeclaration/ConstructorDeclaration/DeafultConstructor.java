package AST.ClassDeclaration.ConstructorDeclaration;

import AST.Parameter;
import AST.Statement.BlockStatement;
import Code_Generation.CodeResult;

import java.util.List;

public class DeafultConstructor implements ConstructorDeclaration{
    private BlockStatement body;
    private List<Parameter> parameters;

    @Override
    public CodeResult generateCode() {
        return null;
    }

    public DeafultConstructor(List<Parameter> parameters, BlockStatement body) {
        this.body = body;
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nDefaultConstructor{");
        if (parameters != null) {
            sb.append("parameters=").append(parameters);
        }
        if (body != null) {
            if (parameters != null) sb.append(", ");
            sb.append("body=").append(body);
        }
        sb.append('}');
        return sb.toString();
    }
}
