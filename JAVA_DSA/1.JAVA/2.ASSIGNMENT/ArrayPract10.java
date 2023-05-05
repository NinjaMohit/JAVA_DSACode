
///Find the minimum element in the array
//Ip=12504
//op=0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayPract10 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter n Integer array Size");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        System.out.println("Enter array Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("minimum element present in given array: " + min);
    }
}





