//WPA to merge two given array
// ip=array1=[1,2,3,4]   array2=[5,6]
// Op=array3[]=[1,2,3,4,5,6]


import java.io.*;

public class ArrayPract14 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter n Integer array Size");
        int size1 = Integer.parseInt(br.readLine());
        int size2 = Integer.parseInt(br.readLine());
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        System.out.println("Enter array 1 Element");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }


        System.out.println("Enter array 2 Element");
        for (int i = 0; i< arr2.length; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }

        int size3 = size1 + size2;
        int arr3[] = new int[size3];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        System.out.println("Merge array:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }


}
