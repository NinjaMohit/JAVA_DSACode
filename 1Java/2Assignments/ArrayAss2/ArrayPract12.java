//WAP Find common Common element in array
//ip=1235  1298
//op=12

import java.io.*;
public class ArrayPract12 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter n Integer array Size");
        int size = Integer.parseInt(br.readLine());
        int arr1[] = new int[size];
        int arr2[] = new int[size];

        System.out.println("Enter array 1 Element");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter array 2 Element");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = Integer.parseInt(br.readLine());
        }
        System.out.println("common element:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}

