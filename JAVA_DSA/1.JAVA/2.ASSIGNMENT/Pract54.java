/* WAP to print all even numbers in reverse order and odd numbers in std way
 * i/p = 2
 * i/p = 9
 * o/p = 8 6 4 2
 * 	     3 5 7 9		*/

import java.io.*;
class Pract54 {

    public static void main(String[] a) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter start No");
        int sno = Integer.parseInt(br.readLine());
        System.out.println("Enter End No");
        int eno = Integer.parseInt(br.readLine());

        System.out.println("Even no");
        for (int i = eno; i >= sno; i--) {
            if (i % 2 == 0) {

                System.out.print(i + " ");
            }
        }

         System.out.println("\n"+"Odd no");
        for (int i = sno; i <= eno; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}


