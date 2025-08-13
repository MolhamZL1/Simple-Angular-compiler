package AST.ComponentClasses.Template;
import Code_Generation.CodeResult;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class TemplateUrl implements TemplateProperty{
   private String templateUrl;

    public TemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    @Override
    public String toString() {
        return "TemplateUrl{"
               + templateUrl  +
                '}';
    }


    @Override
    public CodeResult generateCode() {
        CodeResult result = new CodeResult("","");
        try {
            // اقرأ محتوى الملف كاملاً كـ HTML، ولا تفصل JS (يمكن تحتاج تحسين حسب الحالة)
            String content = Files.readString(Paths.get(templateUrl));
            result.html = content;
            result.js = ""; // لو بدك تقرأ JS منفصل أو تفرقها بعدين، بتعدل هنا
        } catch (IOException e) {
            e.printStackTrace();
            result.html = "";
            result.js = "";
        }
        return result;
    }

}
