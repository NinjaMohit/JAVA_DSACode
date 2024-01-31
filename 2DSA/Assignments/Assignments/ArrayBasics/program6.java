/* 
6] Elements in the Range

Given an array arr[] containing positive elements. A and B are two numbers
defining a range. The task is to check if the array contains all elements in the given
range.
Example 1:
Input: N = 7, A = 2, B = 5
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: Yes
Explanation: It has elements between range 2-5 i.e 2,3,4,5
Example 2:
Input: N = 7, A = 2, B = 6
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: No
Explanation: Array does not contain 6.
Note: If the array contains all elements in the given range then driver code outputs
Yes otherwise, it outputs No
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
1 ≤ N ≤ 10^7
*/
import java.io.*;
public class program6 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Integer");
        
        int n=Integer.parseInt(br.readLine());

        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        System.out.println("Enter a Range Between");
        int A=Integer.parseInt(br.readLine());
        int B=Integer.parseInt(br.readLine());

        boolean x=false;
        for(int i=A;i<B;i++){
           for(int j=0;j<=arr.length;j++){
            if(arr[i]==j){
                x=true;
                
            }
            else{
                x=false;
            }
           }

            }

            System.out.println(x);
        }

    } 

