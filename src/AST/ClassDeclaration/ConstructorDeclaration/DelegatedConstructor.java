package AST.ClassDeclaration.ConstructorDeclaration;

import AST.Args;
import AST.Parameter;

import java.util.List;

public class DelegatedConstructor implements ConstructorDeclaration{
    private List<Parameter> parameters;
private Args args;

    public DelegatedConstructor(List<Parameter> parameters, Args args) {
        this.parameters = parameters;
        this.args = args;
    }

    @Override
    public String toString() {
        return "\nDelegatedConstructor{" +
                "parameters=" + parameters +
                ", args=" + args +
                '}';
    }
}
