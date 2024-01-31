/*7] Form largest number from digits

Given an array of numbers from 0 to 9 of size N. Your task is to rearrange elements
of the array such that after combining all the elements of the array, the number
formed is maximum.
Example 1:
Input:
N = 5
A[] = {9, 0, 1, 3, 0}
Output:
93100
Explanation:
Largest number is 93100 which can be formed from array digits.
Example 2:
Input:
N = 3
A[] = {1, 2, 3}
Output:
321

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
1 <= N <= 10^7
0 <= Ai <= 9 */


import java.io.*;
import java.util.*;

public class program7 {
      
       static int Largedigit(int arr[]){
        Arrays.sort(arr);
        int rev=0;
        for(int i=arr.length-1;i>=0;i--){
         rev=rev*10+arr[i];
        }
        return rev;
       }
       
        public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Integer");
        
        int n=Integer.parseInt(br.readLine());

        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        System.out.println(Largedigit(arr));

    }
}