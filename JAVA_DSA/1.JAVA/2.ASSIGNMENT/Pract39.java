import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pract39 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int rev = 0;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (rev == temp) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not pallindrome");
        }
    }
}

