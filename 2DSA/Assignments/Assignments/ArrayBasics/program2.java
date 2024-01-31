/*2] Find minimum and maximum element in an array

Given an array A of size N of integers. Your task is to find the minimum and
maximum elements in the array.
Example 1:
Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output: 1 10000
Explanation: minimum and maximum elements of array are 1 and 10000.
Example 2:
Input:
N = 5
A[] = {1, 345, 234, 21, 56789}
Output: 1 56789
Explanation: minimum and maximum elements of array are 1 and 56789.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <= 10^5
1 <= Ai <=10^12 */
import java.io.*;

public class program2 {
   public static void main(String[] args)throws IOException {
    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a array size");
        int N=Integer.parseInt(br.readLine());

        int[] arr=new int[N];

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }


    int max=arr[0],min=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        else if(arr[i]<min){
            min=arr[i];
        }

        }
        System.out.println("MAximum and minimum element in arr "+max +" and "+min);
    }
   } 

