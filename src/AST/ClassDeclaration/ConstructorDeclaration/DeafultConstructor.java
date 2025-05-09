package AST.ClassDeclaration.ConstructorDeclaration;

import AST.Parameter;
import AST.Statement.BlockStatement;

import java.util.List;

public class DeafultConstructor implements ConstructorDeclaration{
    private BlockStatement body;
    private List<Parameter> parameters;

    public DeafultConstructor(BlockStatement body, List<Parameter> parameters) {
        this.body = body;
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "\nDeafultConstructor{" +
                "body=" + body +
                ", parameters=" + parameters +
                '}';
    }
}
