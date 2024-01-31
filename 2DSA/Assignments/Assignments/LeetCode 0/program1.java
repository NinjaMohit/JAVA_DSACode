//1.Reverse Int 
import java.util.*;
class program1 {
    public static int reverse(int x) {
      long rev=0;
       
        while(x!=0){
            int rem=x%10;
             rev=rev*10+rem;
             x=x/10;
        }
        if(Integer.MAX_VALUE>=rev && rev>=Integer.MIN_VALUE){
        return (int)rev;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();


      int ans= reverse(x);
      System.out.println(ans);
      
    }
}