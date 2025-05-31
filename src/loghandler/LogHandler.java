package loghandler;

import java.io.FileWriter;
import java.io.IOException;

public class LogHandler {
   static public String filename = "C://Users//USER//Desktop//New folder//angularCompiler2//src//errors.txt";
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
