package AST.Primary;

import AST.Args;
import AST.Identifier;
import AST.Type;
import Code_Generation.CodeResult;

public class ObjectInit implements  Primary {
private Identifier className;
private Type type;
private Args args;

    public ObjectInit(Identifier className, Type type, Args args) {
        this.className = className;
        this.type = type;
        this.args = args;
    }

    @Override
    public String toString() {
        return "\nObjectInit{" +
                "className=" + className +
                ", type=" + type +
                ", args=" + args +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        String name = className == null ? "" : className.getIdentifier();
        CodeResult a = args != null ? args.generateCode() : new CodeResult("", "");
        String expr = "new " + name + "(" + a.html + ")";
        return new CodeResult(expr, a.js==null? "": a.js);
    }
}
