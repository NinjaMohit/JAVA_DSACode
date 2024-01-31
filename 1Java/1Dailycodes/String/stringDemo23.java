import java.io.BufferedReader;
import java.io.*;

//Self create compareTo fuction

public class stringDemo23 {

    static int myStrLen(String str1) {
        char arr[] = str1.toCharArray();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }

    static int myCompareTo(String str1, String str2) {
        int len1 = myStrLen(str1);
        int len2 = myStrLen(str2);

        if (len1 != len2) {
            return len1 - len2;
        }
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] != arr2[i]) {
                    return arr1[i] - arr2[i];
                }
            }
            return 0;

        }

        public static void main (String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter First String:");
            String str1 = br.readLine();
            System.out.println("Enter second String:");
            String str2 = br.readLine();
            int ans = myCompareTo(str1, str2);
            System.out.println(ans);

            if (ans == 0) {
                System.out.println("Equal");
            } else {
                System.out.println("Not equal");
            }
        }
    }
