//Ranege Query
//Prefix sum

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        int N=10;int Q=3;
        int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};

        int  psArr[]=new int[N];
        psArr[0]=arr[0];

        for(int i=1;i<N;i++){
          psArr[i]=psArr[i-1]+arr[i];
          System.out.println(psArr[i]);
        }
        
        
         int sum=0;
          Scanner sc=new Scanner(System.in);
         for(int i=0;i<Q;i++){
            System.out.println("ENter start ");
            int startindex=sc.nextInt();
            
            System.out.println("ENter ENd ");
            int endindex=sc.nextInt();

            if(startindex==0){
                sum=psArr[endindex];
            }
            else{
                sum=psArr[endindex]-psArr[startindex-1];
                
            }
             System.out.println(sum);
        }
    }
}
