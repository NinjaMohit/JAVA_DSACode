import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//WAP take size of array from user and also take integer element From user print Product of odd index only
//ip=1,2,3,4,5,6
//op=48

//Oddd Index mean even no
 class ArrayPract3 {
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



