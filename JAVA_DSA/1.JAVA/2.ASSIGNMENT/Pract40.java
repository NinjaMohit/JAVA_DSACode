//Armstrong no
//op=153=  1+27+125
import java.io.*;
public class Pract40 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int temp1 = n;
        int temp2 = n;
        int count = 0;
        int sum = 0;

        while (temp1 > 0) {
            count++;
            temp1 = temp1 / 10;
        }
        while (temp2 > 0) {

            int rem = temp2 % 10;
            int mul = 1;

            for (int i = 1; i <= count; i++) {
                mul = mul * rem;
            }
            sum = sum + mul;
            temp2 = temp2 / 10;
        }
        if (sum == n) {
            System.out.println("Armstrong no");
        } else {
            System.out.println("Not Arm");
        }
    }
}