package AST;

import AST.Primary.Literal;
import Code_Generation.CodeResult;

public class Parameter implements ASTNode{
   private Identifier id;
   private Type type;
   private Literal value;

    public Parameter(Identifier id, Type type, Literal value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "id='" + id + '\'' +
                (type != null ? ", type=" + type : "") +
                (value != null ? ", value=" + value : "") +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        return null;
    }
}
