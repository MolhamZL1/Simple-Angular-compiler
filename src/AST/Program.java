package AST;

import java.util.ArrayList;
import java.util.List;

public class Program implements ASTNode {
    public List<ASTNode> children=new ArrayList<ASTNode>();
    public void addChild(ASTNode child){
        this.children.add(child);
    }
    @Override
    public String toString(){
        String program="";
        for (ASTNode child:children ) {
            if(child!=null){
                program+="\t"+child.toString();
            }
        }
        return "Program:{"+program+"\n}";
    }
}
