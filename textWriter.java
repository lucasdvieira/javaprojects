import java.io.PrintWriter;
import java.lang.*;
import java.util.*;
class Main {
  public static void main(String[] args) throws Exception {
    if (args.length != 2){
      System.out.println("Usage: java Main Str SourceFile");
      System.exit(1);
    }
    File sourceFile = new File(args[1]);
    if (!sourceFile.exists()){
      System.out.println("Source file " + args[1] + " does not exist");
      System.exit(2);
    }
    try(
      Scanner input = new Scanner(sourceFile);
      PrintWriter output = new PrintWriter(sourceFile);

    ){
      while (input.hasNext()){
        String s = input.nextLine();
        StringBuffer sb = new StringBuffer(s);
        StringBuffer sbInput = new StringBuffer(args[0]);
        if (sb == sbInput){
          sb.delete(0,sb.length());
          
        }
        output.println(sb);
      }
    }
  }
}