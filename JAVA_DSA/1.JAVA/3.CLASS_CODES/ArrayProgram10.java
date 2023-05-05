import java.io.*;
class ArrayDemo1{
     public static void main(String[] args)throws IOException{

          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter a Array size");
          int size=Integer.parseInt(br.readLine());
          int[] arr=new int[size];

          System.out.println("enter a element");
          for(int i=0;i<arr.length;i++){
               arr[i]=Integer.parseInt(br.readLine());
          }
          int sum=0;
          for(int i=0;i<arr.length;i++){
               sum=sum+arr[i];
          }
          System.out.println(sum);
     }
}

