/*Replace all 0's with 5

You are given an integer N. You need to convert all zeros of N to 5.
Example 1:
Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".
Example 2:
Input:
N = 121
Output: 121
Explanation: Since there are no zeroes in
"121", the number remains as "121".
Expected Time Complexity: O(K) where K is the number of digits in N
Expected Auxiliary Space: O(1)
Constraints:
1 <= n <= 10000 */

import java.io.*;
public class program5 {
    
    int replace(int n){
     int rev=0;
        while(n>0){
            int rem=n%10;
            if(rem==0){
                rem=5;
            }
            rev=rev*10+rem;
            n=n/10;
        }
        int temp=rev;
        int ans=0;
        while(temp>0){
            int x=temp%10;
             ans=ans*10+x;
            temp=temp/10;
        }
        return ans;
    }

    
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Integer");
        
        int n=Integer.parseInt(br.readLine());

        program5 obj=new program5();
        System.out.println(obj.replace(n));

    }
}
