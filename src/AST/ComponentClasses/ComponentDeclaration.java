package AST.ComponentClasses;


import AST.ASTNode;
import AST.ComponentClasses.Template.TemplateProperty;
import AST.ComponentClasses.Template.TemplateUrl;
import AST.Program;
import Code_Generation.CodeGeneration;
import Code_Generation.CodeResult;
import SymbolTable.Component.ComponentSymbol;
import SymbolTable.Component.ComponentsSymboleTable;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.BaseVisitor;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ComponentDeclaration implements ASTNode {


    private List<MetadataProperty> metadataPropertyList;

    public ComponentDeclaration(List<MetadataProperty> metadataPropertyList) {
        this.metadataPropertyList = metadataPropertyList;
    }

    @Override
    public String toString() {
        return "\nComponent{"+metadataPropertyList+"}";
    }
    @Override
    public CodeResult generateCode() {
        CodeResult codeResult=null;
        for (MetadataProperty item:metadataPropertyList) {
            if (item instanceof SelectorProperty){
             ComponentSymbol componentSymbol=   ComponentsSymboleTable.symbols.get(((SelectorProperty) item).getSelector());
                System.out.println(componentSymbol.getName());
             String templateHtml=componentSymbol.getTemplatePath();
             try {
                 ParseTree componentTree=   CodeGeneration.parse(templateHtml);
                 Program componentProgram = (Program) new BaseVisitor(new ComponentsSymboleTable(), templateHtml).visit(componentTree);
                  codeResult=  componentProgram.generateCode();

             } catch (IOException e) {
                 throw new RuntimeException(e);
             }

            }
        }
        // بيانات تعريفية فقط — لا HTML ولا JS وقت التشغيل
        return codeResult;
    }
}
