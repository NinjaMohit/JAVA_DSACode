//   Strong number
//ip=145=1!+4!+5!
//op=Srrong no


import java.io.*;

public class Pract37 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int temp1 = n;
        while (n > 0) {
            int rem = n %10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact *i;
            }
            sum = sum + fact;
            n=n/10;
        }
        System.out.println(sum);

         if(temp1==sum){
             System.out.println("Strong no");
         }
         else{
             System.out.println("No strong no");

         }
    }
}