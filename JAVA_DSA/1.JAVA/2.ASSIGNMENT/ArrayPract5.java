
///WAP take 10 input integer element From user print divisible by 5 only
import java.io.*;
public class ArrayPract5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Size of array:");
        int size=Integer.parseInt(br.readLine());
        int[] arr=new int[size];

        System.out.println("Enter integer element:");
        for(int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%5==0){
                System.out.println("Divisible by 5 are: "+  arr[i]);
            }
        }

    }
}


