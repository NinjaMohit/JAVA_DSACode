import java.io.*;
public class ArrayPract6 {
    public static void main(String[] args)throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter n Integer array Size");
            int size = Integer.parseInt(br.readLine());
            int arr[] = new int[size];

            System.out.println("Enter array Element");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum = sum + arr[i];

        }
        System.out.println(sum);
    }

}
