/*10 10 10 10 
11 11 11
12 12
13
 */

class Program5 {

    public static void main(String[] args) {

        int row = 4;

        int num = 10;
        for (int i = 1; i <= row; i++) {
            for (int j = i; j <= 4; j++) {

                System.out.print(num + " ");
            }
            num++;

            System.out.println();
        }
    }
}
