import java.util.Scanner;

class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Enter First No");
        num1 = sc.nextInt();

        System.out.println("Enter Second No");
        num2 = sc.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Negative no not alllowed");
        } else {
            switch (num1 * num2 % 2) {
                case 0:
                    System.out.println("Mul is even");
                    break;

                case 1:
                    System.out.println("mul is odd");
                    break;
            }
        }

    }
}
