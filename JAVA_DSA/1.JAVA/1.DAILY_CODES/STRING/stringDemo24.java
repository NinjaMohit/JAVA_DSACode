import java.io.BufferedReader;
import java.io.*;

public class stringDemo24 {

       static String mySubString(String str,int start){
           char arr[]=str.toCharArray();
           String ans=" ";
           for(int i=start;i<arr.length;i++){
               ans=ans+arr[i];
           }
           return ans;
       }

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a string");
        String str=br.readLine();

        System.out.println(str.substring(4));
        System.out.println(mySubString(str,1));





    }
}
