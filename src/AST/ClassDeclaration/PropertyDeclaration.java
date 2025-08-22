package AST.ClassDeclaration;

import AST.ASTNode;
import AST.ExpressionsClasses.Expression;
import AST.Identifier;
import AST.Type;
import Code_Generation.CodeResult;

public class PropertyDeclaration implements ClassStatment{
    private Identifier name;
    private Type type;
    private Expression value;

    public PropertyDeclaration(Identifier name, Type type, Expression value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nPropertyDeclaration{" +
                "name=" + name +
                (type != null ? ", type=" + type : "") +
                (value != null ? ", value=" + value : "") +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        String id = name == null ? "_" : name.getIdentifier();
        CodeResult v = value != null ? value.generateCode() : new CodeResult("", "");
        String assign = (v.html == null || v.html.isBlank()) ? "" : (" = " + v.html);
        String js = "var " + id + assign + ";\n";
        return new CodeResult("", safe(v.js) + js);
    }

    private static String safe(String s){ return s==null? "": s; }
}
