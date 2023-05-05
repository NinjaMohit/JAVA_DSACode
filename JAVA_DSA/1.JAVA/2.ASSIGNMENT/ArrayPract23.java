/*WAP to find a Armstrong no from array and return its index
Ip=10,25,252,36,153,55,89
Op=Strong no 145 found at index:5
 */



import java.util.Scanner;

public class ArrayPract23 {
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
            int temp1 = arr[i];
            int temp2 = arr[i];
            int count = 0;

            int sum = 0;
            while (temp1 > 0) {

                count++;
               temp1=temp1/10;
            }
            while (temp2 > 0) {
                int mul = 1;
                int rem=temp2%10;
                for (int j = 1; j <= count; j++) {
                    mul = mul * rem;
                }
                sum = sum + mul;
                temp2=temp2/10;
            }
            System.out.println(sum);
            if (sum == arr[i]) {
                System.out.println("ArmStrong no "+arr[i]+" found at index "+i);
            }
        }
    }
}
