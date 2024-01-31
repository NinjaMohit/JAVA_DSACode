import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number");
        int n=sc.nextInt();

        switch(n/10){
            case 10:
            case 9:
                System.out.println("First class");
                break;
            case 8:
            case 7:
                System.out.println("Second class");
                break;
            case 6:
            case 5:
                System.out.println("good");
                break;
            case 4:
                System.out.println("pass");
                break;
            default:
                System.out.println("fail");
                break;

        
	}
    }
}
