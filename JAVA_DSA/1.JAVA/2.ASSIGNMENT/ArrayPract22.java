/*WAP to find Strong no from array and return index
IP=10,25,252,36,564,145
op=Strong no 145 found at index:5               /145=1!+4!+5!
 */
import java.util.*;
class ArrayPract22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a arry Size:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter element of Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {

            int temp1= arr[i];
            int sum = 0;

            while (temp1 > 0) {
                int fact = 1;
                int rem = temp1 % 10;
                for (int j = 1; j <= rem; j++) {

                    fact = fact * j;

                }

                sum = sum + fact;
                temp1 = temp1 / 10;
            }

            if (sum == arr[i]) {
                System.out.println("Strong No " + arr[i]+" found at index "+i);
            }
        }
    }
}
