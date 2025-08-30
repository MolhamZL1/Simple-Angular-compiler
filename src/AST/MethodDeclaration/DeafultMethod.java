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
        String fnName = (name == null ? "_fn" : name.getIdentifier());
        String params = parameters.stream().map(Parameter::getName).collect(Collectors.joining(", "));
        StringBuilder js = new StringBuilder();
        js.append(isAsync ? "async function " : "function ").append(fnName).append("(").append(params).append("){\n");

        CodeResult br = body.generateCode();
        js.append(safe(br.js));

        js.append("}\n");
        return new CodeResult("", js.toString());
    }
    private static String expr(CodeResult c){
        if (c == null) return "";
        String js = (c.js == null ? "" : c.js.trim());
        if (!js.isEmpty()) return js;              // لو العقدة أنتجت تعبير JS واضح، خُذْه
        return (c.html == null ? "" : c.html);     // وإلا خُذ النص (مثل المعرّفات والأرقام حالياً)
    }


    private static String safe(String s){ return s==null? "": s; }

}
