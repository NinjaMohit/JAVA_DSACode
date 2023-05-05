
//Perfect Number
//ip=6 =1+2+3
//op=perfect no;

import java.io.*;

public class Pract38 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int sum=0;
            for(int i=1;i<n;i++) {
                if (n % i == 0) {
                    sum = sum + i;
                    System.out.println(i);
                }

            }
            if(sum==n){
                System.out.println("Perfect No");
            }
            else{
                System.out.println("not");
            }
    }
}
