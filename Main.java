import java.io.*;
public class Main{
  public static void main(String[] args){
    String s = null;
    BufferedReader stdIn = new BufferedReader(
      new InputStreamReader(System.in)
      );
    Command = stdIn.readLine()
    try {
        Process p = Runtime.getRuntime().exec("python3 Main.py "+Command+"\n");
        
        BufferedReader stdInput = new BufferedReader(new 
             InputStreamReader(p.getInputStream()));

        BufferedReader stdError = new BufferedReader(new 
             InputStreamReader(p.getErrorStream()));

        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
        
        //while ((s = stdError.readLine()) != null) {
            //System.out.println(s);
        //}
        
        System.exit(0);
    }
    catch (IOException e) {
        e.printStackTrace();
        System.exit(-1);
    }
  }
}
