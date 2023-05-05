import java.io.*;
class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
       InputStreamReader isr=new InputStreamReader(System.in);

        System.out.println("Enter name");
        String name=br1.readLine();
        System.out.println(name);
        br1.close();
        
        char ch=(char)isr.read();
        System.out.println("char="+ch);

    }
}
