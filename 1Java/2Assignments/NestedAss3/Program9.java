public class Program9 {
    public static void main(String[] args) {
        int rows = 3;
        int x = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x * x * x + " ");
                x++;
            }

            System.out.println();
        }
    }
}
