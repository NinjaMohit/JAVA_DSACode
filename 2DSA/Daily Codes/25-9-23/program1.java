//Sum of n digit 

import java.util.Scanner;

class program1{
    static int SumofN(int n){
        int sum=0;
        sum=n*(n+1)/2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(SumofN(n));
    }
}