
/* WPA to print count of digit in element of array

IP=Enter array Element:02 ,255,2,1554
OP=2,3,1,4
*/
import java.io.*;
public class ArrayPract16 {

    class ArrayProgram16 {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter array Size");
            int size = Integer.parseInt(br.readLine());
            int[] arr = new int[size];

            System.out.println("Enter array Element");
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < size; i++) {
                int n = arr[i];
                int count = 0;
                while (n > 0) {
                    int rem = n % 10;
                    count++;
                    n = n / 10;
                }
                System.out.println(count);
            }
        }
    }

}
