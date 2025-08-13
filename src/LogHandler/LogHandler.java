package LogHandler;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class LogHandler {
   static public String filename = "src/errors.txt";

    static public String getErrMessage(ErrorType errorType, Map data){
        if (errorType == ErrorType.PrparetyDefined) {
            return "the Proparaty (" + data.get("name") + ")  is defined at file(" + data.get("fileName") + ") at line(" + data.get("line") + ")";
        } else if (errorType == ErrorType.PrparetyNotFound) {
            return "Property " +  data.get("name") + " at " + data.get("fileName")+" does not exist on its Component";
        } else if (errorType == ErrorType.ComponentDefined) {
            return "the Component (" +  data.get("name")  + ") is defined at file(" +  data.get("fileName")  + ") at line(" +data.get("line") + ")";
        }
        else if (errorType == ErrorType.ComponentNotFound) {
            return "Cannot find module (" +  data.get("name")  + ") at file(" +  data.get("fileName")+")" ;
        }
        else if (errorType == ErrorType.MethodDefined) {
            return "The method (" +  data.get("name")  + ") at file(" +  data.get("fileName")  + ") at line(" +data.get("line") + ") is defined";
        } else if (errorType == ErrorType.MethodNotFound) {
            return "Method (" +  data.get("name") + ") at (" + data.get("fileName")+") does not exist on its Component";
        }
        else if (errorType == ErrorType.InputDefined) {
            return "The Input Property(" +  data.get("name")  + ") is defined at file(" +  data.get("fileName")  + ") at line(" +data.get("line") + ")";
        } else if (errorType == ErrorType.InputNotFound) {
            return "Input Property (" +  data.get("name") + ") at (" + data.get("fileName")+") does not exist on its Component";
        }
        else if (errorType == ErrorType.ArgsMethodDefined) {
            return "The Property (" +  data.get("name")  + ") is defined at Method (" +  data.get("methodName")  +  ") at " + data.get("fileName")+ " at line(" +data.get("line") + ")";
        }
        else{
            return "Not detected";
        }

    }
  static public void log(Exception exception){
       String content = exception.getMessage();
       try {
           FileWriter writer = new FileWriter(filename,true);
           writer.write(content+"\n");
           writer.close();
         //  System.out.println("Successfully wrote to the file.");
       } catch (IOException e) {
           System.out.println("An error occurred.");
       }
    }

    static public void clear() throws IOException {
        FileWriter writer = new FileWriter(LogHandler.filename);
        writer.write("");
        writer.close();
    }
  static public void printError(String msg){
        System.err.println(ColorsConsole.RED + "Semantic Error: " + msg + ColorsConsole.RESET);
        System.exit(0);
    }
}
