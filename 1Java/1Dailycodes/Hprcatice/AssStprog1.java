//1 =wap to search for giver string in array of String

import java.io.*;

public class AssStprog1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("String size");
        int n = Integer.parseInt(br.readLine());

        String arr[] = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        System.out.println("ENter a Search String");
        String str1 = br.readLine();

        for (int i = 0; i < arr.length; i++) {
            if (str1.equals(arr[i])) {
                System.out.println(arr[i] + "String found at index at " + i);
            }

        }

    }
}
