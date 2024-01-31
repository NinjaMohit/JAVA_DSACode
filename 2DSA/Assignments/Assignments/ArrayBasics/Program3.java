/*3] Largest Element in Array

Given an array A[] of size n. The task is to find the largest element in it.
Example 1:
Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output: 90
Explanation:
The largest element of a given array is 90.
Example 2:
Input:
n = 7
A[] = {1, 2, 0, 3, 2, 4, 5}
Output: 5
Explanation:
The largest element of a given array is 5.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= n<= 10^3
0 <= A[i] <= 10^3
Arrays may contain duplicate elements. */


import java.io.*;

public class Program3 {
   public static void main(String[] args)throws IOException {
    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a array size");
        int N=Integer.parseInt(br.readLine());

        int[] arr=new int[N];

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }


    int large=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>large){
            large=arr[i];
        }
    }
    System.out.println("LARGEST ELEMENT IN ARRAY"+large);
}

}
