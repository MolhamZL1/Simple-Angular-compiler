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

    public Identifier getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public Literal getValue() {
        return value;
    }

    public String getName() { return id == null ? "_" : id.getIdentifier(); }

    @Override
    public CodeResult generateCode() {
        // المعامل يُستخدم كاسم فقط وقت بناء الدوال
        return new CodeResult(getName(), "");
    }
}
