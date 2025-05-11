package AST.Statement;

import AST.ClassDeclaration.ClassStatment;
import AST.ExpressionsClasses.Expression;
import AST.Identifier;
import AST.Type;

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
}
