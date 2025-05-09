package AST.Primary;

import AST.Args;
import AST.Identifier;
import AST.Type;

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
}
