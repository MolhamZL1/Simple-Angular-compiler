package AST.Primary;

import AST.ASTNode;
import AST.ExpressionsClasses.Expression;
import Code_Generation.CodeResult;

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

    @Override
    public CodeResult generateCode() {
        CodeResult v = value != null ? value.generateCode() : new CodeResult("undefined", "");
        String pair = key + ": " + (v.html==null?"":v.html); // key متضمنة اقتباسات
        return new CodeResult(pair, v.js==null? "": v.js);
    }
}
