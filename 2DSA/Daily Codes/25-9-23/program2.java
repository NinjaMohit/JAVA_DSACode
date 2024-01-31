
//Difference between two number

import java.util.Scanner;

public class program2 {
    static int Count(int a,int b){
        return b-a+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Count(a,b));

    }
}
