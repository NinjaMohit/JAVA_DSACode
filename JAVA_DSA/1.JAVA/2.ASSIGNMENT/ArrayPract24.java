/*WAP to print Second max element in array
IP=2,255,2,1554,15,65
Op=255
 */


import java.util.Scanner;

class ArrayPract24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a arry Size:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter element of Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Second largest element:");
        int max = arr[0];
        int secondMax = 0;
        for (int i = 0; i < size; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (max != arr[i] && secondMax < arr[i]) {

            }

        }System.out.println(secondMax);
    }
}

