
//WAP take size of array from user and also take integer element From user print Sum of Odd element only
//ip=1,2,3,4,5
//op=9

import java.io.*;
 class ArrayPract1 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Size of array:");
        int size=Integer.parseInt(br.readLine());
        int[] arr=new int[size];

        System.out.println("Enter integer element:");

        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(arr[i]%2==1){
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);

    }
}
