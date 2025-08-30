package AST.Statement;

import AST.ClassDeclaration.ClassStatment;
import AST.ExpressionsClasses.Expression;
import AST.Identifier;
import AST.Type;
import Code_Generation.CodeResult;

public class VariableDeclaration implements Statement , ClassStatment {
    private boolean isExported;
    private VariableDeclarationKeyword variableDeclarationKeyword;
    private Type type;
    private Identifier name;
    private Expression value;
    private Identifier castedType;

    public VariableDeclaration(boolean isExported, VariableDeclarationKeyword variableDeclarationKeyword, Type type, Identifier name, Expression value, Identifier castedType) {
        this.isExported = isExported;
        this.variableDeclarationKeyword = variableDeclarationKeyword;
        this.type = type;
        this.name = name;
        this.value = value;
        this.castedType = castedType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nVariableDeclaration{");
        sb.append("isExported=").append(isExported);
        sb.append(", variableDeclarationKeyword=").append(variableDeclarationKeyword);
        if (type != null) {
            sb.append(", type=").append(type);
        }
        sb.append(", name=").append(name);
        if (value != null) {
            sb.append(", value=").append(value);
        }

        if (castedType != null) {
            sb.append(", castedType=").append(castedType);
        }

        sb.append('}');
        return sb.toString();
    }

    @Override
    public CodeResult generateCode() {
        String kw = (variableDeclarationKeyword == null ? "let" : variableDeclarationKeyword.getKeyword());
        String id = (name == null ? "_" : name.getIdentifier());
        CodeResult v = (value == null ? new CodeResult("", "") : value.generateCode());

        String assignExpr = expr(v); // <-- المهم
        String js = ( (v.js==null? "": v.js) ) + kw + " " + id + (assignExpr.isBlank()? "" : (" = " + assignExpr)) + ";\n";
        return new CodeResult("", js);
    }
    private static String expr(CodeResult c){
        if (c == null) return "";
        String js = (c.js == null ? "" : c.js.trim());
        if (!js.isEmpty()) return js;              // لو العقدة أنتجت تعبير JS واضح، خُذْه
        return (c.html == null ? "" : c.html);     // وإلا خُذ النص (مثل المعرّفات والأرقام حالياً)
    }



    private static String safe(String s){ return s==null? "": s; }
}
