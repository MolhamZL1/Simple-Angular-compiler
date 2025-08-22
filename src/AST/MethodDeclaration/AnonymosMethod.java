package AST.MethodDeclaration;

import AST.ASTNode;
import AST.Args;
import AST.ExpressionsClasses.Expression;
import AST.Parameter;
import AST.Statement.Statement;
import AST.Type;
import Code_Generation.CodeResult;

import java.util.List;
import java.util.stream.Collectors;

public class AnonymosMethod implements MethodDeclaration, Expression {
private boolean isAsync;
private List<Parameter> parameters;
private Args args;
private Type type;
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
    @Override
    public CodeResult generateCode() {
        String params = parameters.stream().map(Parameter::getName).collect(Collectors.joining(", "));
        StringBuilder expr = new StringBuilder();
        expr.append("(").append(isAsync ? "async " : "").append("function(").append(params).append("){\n");

        if (body instanceof Statement st) {
            CodeResult br = st.generateCode();
            expr.append(safe(br.js));
        } else if (body instanceof Expression ex) {
            CodeResult br = ex.generateCode();
            expr.append(safe(br.js));
            expr.append("return ").append(br.html == null ? "undefined" : br.html).append(";\n");
        } else if (body != null) {
            CodeResult br = body.generateCode();
            expr.append(safe(br.js));
        }

        expr.append("})");
        // كمُعادل تعبيري: نرجّعه في html (تعـبير JS)
        return new CodeResult(expr.toString(), "");
    }

    private static String safe(String s){ return s==null? "": s; }
}
