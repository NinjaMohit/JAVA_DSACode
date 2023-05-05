/* #====
   =#===
   ==#==
   ===#==
   ====#
 */

import java.io.*;
public class Pract52 {
        public static void main(String[] args)throws IOException{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a row");
            int row=Integer.parseInt(br.readLine());

            for(int i=1;i<=5;i++){
                for(int j=1;j<=5;j++){
                    if(i==j){
                        System.out.print("#"+" ");
                    }
                    else{
                        System.out.print("="+" ");
                    }
                }
                System.out.println();
            }


        }
    }


