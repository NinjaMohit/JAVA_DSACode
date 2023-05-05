
//WAP Find uncommon  element in array
//ip=1235  1298
//op=3598//error


import java.io.*;

public class ArrayPract13 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter n Integer array Size");
        int size = Integer.parseInt(br.readLine());
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.println("Enter array 1 Element");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter array 2 Element");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = Integer.parseInt(br.readLine());
        }
        System.out.println("uncommon element:");

        for (int i = 0; i < size; i++) {

            int match = 0;

            for (int j = 0; j < size; j++) {
                if (arr1[i] == arr2[j]) {
                    match++;
                }
            }

                if (match == 0) {
                    System.out.print(arr1[i] + " ");
                    System.out.print(arr2[i] + " ");
                }
            }
        }
    }

