package AST.ClassDeclaration.ConstructorDeclaration;

import AST.Args;
import AST.Parameter;
import Code_Generation.CodeResult;

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
                (args != null ? ", args=" + args : "") +
                '}';
    }
    @Override
    public CodeResult generateCode() {
        // ما منبني Prototype/ES6 class حالياً؛ فهالكونستركتر ما إلو أثر بزمن التشغيل
        return new CodeResult("", "");
    }
}
