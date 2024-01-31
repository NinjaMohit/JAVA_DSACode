//WAP to find sum of even and odd number in array

import java.io.*;

public class ArrayPract8 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter n Integer array Size");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        System.out.println("Enter array Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum1 = sum1 + arr[i];

            } else {
                sum2 = sum2 + arr[i];
            }
        }
        System.out.println("No of even element" + sum1);
        System.out.println("No of Odd element" + sum2);
    }

}
