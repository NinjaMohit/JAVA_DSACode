import java.util.Scanner;

/*WAP to print Second max element in array
IP=2,255,2,1554,15,65,95,89
Op=255*/
 public class ArrayPract25 {
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
        int min = arr[0];
        int secondMin = 0;
        for (int i = 0; i < size; i++) {

            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (min !=arr[i] && secondMin > arr[i]) {
                  secondMin=arr[i];
            }

        }System.out.println(secondMin);
    }
}




