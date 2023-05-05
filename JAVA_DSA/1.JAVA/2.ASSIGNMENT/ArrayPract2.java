//WAP take size of array from user and also take integer element From user print Product of even element only
//ip=1,2,3,2,5,10,55,77,99
//op=40



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayPract2 {
    public static void main(String[] args)throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter Size of array:");
    int size=Integer.parseInt(br.readLine());
    int[] arr=new int[size];

    System.out.println("Enter integer element:");

    int Prod=1;
    for(int i=0;i<arr.length;i++){
        arr[i]=Integer.parseInt(br.readLine());
        if(arr[i]%2==0){
            Prod=Prod*arr[i];
        }
    }
    System.out.println(Prod);

}
}


