import java.io.*;
public class ArrayPract9 {
    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Array Size");

        int size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];

        System.out.println("enter a array size");
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter a array index");
        int n=Integer.parseInt(br.readLine());

        for(int i=0;i<size;i++){
            if(arr[i]==n){
                System.out.println(i);
            }
        }

    }
}
