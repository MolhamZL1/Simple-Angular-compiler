package AST.Primary;

import AST.ASTNode;
import AST.ExpressionsClasses.Expression;

public class Mapmember  implements ASTNode {
   private String key;
   private Expression value;

    public Mapmember(String key, Expression value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nMapmember{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
