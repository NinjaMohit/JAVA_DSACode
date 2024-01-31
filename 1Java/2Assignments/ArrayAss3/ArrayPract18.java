/*WAP to find Composite no from array and return its index

IP=1,2,3,5,6,7
OP=Composite 6 fount ata index:4
 */
import java.util.*;
public class ArrayPract18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a array Size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter a array Element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < size; i++) {
            int count=0;
            for (int j = 1; j <=arr[i]; j++) {
                if (arr[i]% j == 0) {
                    count++;
                }
            }

                if (count > 2) {
                    System.out.println("Composite "+arr[i]+"found at index:"+i);
                }
            }
        }
    }

