public class Program6 {
    public static void main(String[] args) {

        int rows = 4;

        for (int i = 1; i < rows; i++) {

            int num = 9;

            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num = num - 1;
            }
            System.out.println();
        }
    }
}
