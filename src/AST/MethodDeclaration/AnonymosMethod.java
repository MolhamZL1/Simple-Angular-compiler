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
        StringBuilder exprJs = new StringBuilder();
        exprJs.append("(").append(isAsync ? "async " : "").append("function(").append(params).append("){\n");

        CodeResult br = body.generateCode();
        exprJs.append(safe(br.js));

        exprJs.append("})");
        return new CodeResult(exprJs.toString(), ""); // كتعبير JS صالح
    }
    private static String expr(CodeResult c){
        if (c == null) return "";
        String js = (c.js == null ? "" : c.js.trim());
        if (!js.isEmpty()) return js;              // لو العقدة أنتجت تعبير JS واضح، خُذْه
        return (c.html == null ? "" : c.html);     // وإلا خُذ النص (مثل المعرّفات والأرقام حالياً)
    }


    private static String safe(String s){ return s==null? "": s; }
}
