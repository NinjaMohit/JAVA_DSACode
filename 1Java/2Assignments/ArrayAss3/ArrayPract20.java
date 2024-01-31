/*WPA find a perfect number from array and return its index
Ip=10.25.252.496.564
Op=Perfect no 496                //6=1,2,3 addition
 */


import java.util.*;
 class ArrayPract20 {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a arry Size:");
         int size=sc.nextInt();
         int arr[]=new int[size];

         System.out.println("Enter element of Array:");
         for(int i=0;i<size;i++) {
             arr[i] = sc.nextInt();
         }

         for(int i=0;i<size;i++){
             int sum=0;
             for(int j=1;j<arr[i];j++){
                 if(arr[i]%j==0){
                     sum=sum+j;
                 }
             }
             System.out.println(sum);
             if(sum==arr[i]){
                 System.out.println("Perfect no "+arr[i]+" found at index:"+i);
             }
         }


     }
}
