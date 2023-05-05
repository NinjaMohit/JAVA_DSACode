public class Pract45 {

    public static void main(String[] args) {

        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            char ch2 = ch;

            for (int j = 1; j <=4 -i+1; j++) {
                System.out.print(ch2 + " ");
                ch2++;
            }
            System.out.println();
            ch++;
        }
    }
}
