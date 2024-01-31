import java.io.*;
import java.util.*;
public class Program1 {
    public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    System.out.println("ENter society name,flat,wing");

    String info= br.readLine();

    StringTokenizer obj=new StringTokenizer(info,",");

        String token1=obj.nextToken();
         int token2=Integer.parseInt(obj.nextToken());
        char token3=obj.nextToken().charAt(0);


        System.out.println("Society"+token1);
        System.out.println("wing"+token2);
        System.out.println("flat"+token3);
    }

}
