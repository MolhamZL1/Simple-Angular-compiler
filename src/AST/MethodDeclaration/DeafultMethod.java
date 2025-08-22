package AST.MethodDeclaration;

import AST.*;
import AST.ExpressionsClasses.Expression;
import AST.Statement.Statement;
import Code_Generation.CodeResult;

import java.util.List;
import java.util.stream.Collectors;

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
    @Override
    public CodeResult generateCode() {
        String fnName = name == null ? "_fn" : name.getIdentifier();
        String params = parameters.stream().map(Parameter::getName).collect(Collectors.joining(", "));

        StringBuilder js = new StringBuilder();
        js.append(isAsync ? "async function " : "function ")
                .append(fnName).append("(").append(params).append("){\n");

        if (body instanceof Statement st) {
            CodeResult br = st.generateCode();
            js.append(safe(br.js));
        } else if (body instanceof Expression ex) {
            CodeResult br = ex.generateCode();
            js.append(safe(br.js));
            js.append("return ").append(br.html == null ? "undefined" : br.html).append(";\n");
        } else if (body != null) {
            CodeResult br = body.generateCode();
            js.append(safe(br.js));
        }

        js.append("}\n");
        return new CodeResult("", js.toString());
    }

    private static String safe(String s){ return s==null? "": s; }

}
