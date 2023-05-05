
    /*	0
     *	1   1
     *	2   3   5
     *	8   13  21  34		*/

import java.io.*;
    class Pract55 {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            int n1 = 0;
            int n2 = 1;
            int n3;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(n1+"    ");
                    n3 = n2 + n1;

                    n1 = n2;
                    n2 = n3;
                }
                System.out.println();
            }
        }
    }


