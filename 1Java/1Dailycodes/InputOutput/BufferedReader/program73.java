import java.io.*;
class Main {
   public static void main(String[] args)throws IOException {
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
       System.out.println("Enter charac");
       char ch = (char)isr.read();
       System.out.println(ch);
   }
   }

