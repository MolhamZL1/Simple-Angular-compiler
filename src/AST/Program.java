package AST;

import Code_Generation.CodeResult;

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

    @Override
    public CodeResult generateCode() {
        CodeResult result = new CodeResult("","");
        StringBuilder htmlCode = new StringBuilder();
        StringBuilder jsCode = new StringBuilder();

        for (ASTNode child : children) {
            if (child != null) {
                CodeResult childCode = child.generateCode();
                if (childCode != null) {
                    if (childCode.html != null) htmlCode.append(childCode.html);
                    if (childCode.js != null) jsCode.append(childCode.js).append("\n");
                }
            }
        }

        result.html = htmlCode.toString();
        result.js = jsCode.toString();

        return result;
    }

}
