/* WAP to reverse each element in array
Ip=10,25,252
Op=01,52,252
 */

import java.util.*;
public class ArrayPract17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Array size");
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.println("Enter array element");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            int n=arr[i];
            int rev=0;
            while(n>0){
                int rem=n%10;
                rev=rev*10+rem;
                n=n/10;
            }
            System.out.println(rev);

        }

    }
}
