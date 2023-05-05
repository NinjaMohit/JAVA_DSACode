import java.io.*;
public class ArrayPract7 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter n Integer array Size");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        System.out.println("Enter array Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count=0;int count1=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] % 2 == 0) {
               count++;
            } else {
                count1++;
            }
        }
        System.out.println("No of even element" + count);
        System.out.println("No of Odd element" + count1);
    }

}


