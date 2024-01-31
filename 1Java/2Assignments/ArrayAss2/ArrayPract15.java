//WAP to print the element Who addition of digit is given
// IP= Enter Array:1,2,3,5,15,16,14,123
//OP=2,15,123

import java.io.*;
public class  ArrayPract15 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter n Integer array Size");
        int size = Integer.parseInt(br.readLine());

        int arr1[] = new int[size];

        System.out.println("Enter array 1 Element");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Even addition no are == ");

        for (int i = 0; i < arr1.length; i++) {
            int sum = 0;
            int n = arr1[i];
            while (n> 0) {
                int rem = n % 10;
                sum = sum + rem;
                n = n / 10;

            }
            if (sum % 2 == 0) {
                System.out.println(arr1[i]);
            }

        }
    }
}
