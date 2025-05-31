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
        StringBuilder program= new StringBuilder();
        for (ASTNode child:children ) {
            if(child!=null){
                program.append("\t").append(child.toString());
            }
        }
        return "{"+program+"\n}";
    }
}
