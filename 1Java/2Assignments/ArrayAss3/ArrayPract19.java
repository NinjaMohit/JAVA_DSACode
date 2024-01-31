/*WAP to print Prime no from an array and return its index
Op=10,25,36,566,34,53,50,100
IP=53
 */

import java.util.*;
class ArrayPract19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a array size");
        int size = sc.nextInt();

        System.out.println("Enter a array element");
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime no " + arr[i] + " found at " + i);
            }
        }
    }
}


