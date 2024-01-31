 class Main {
         public static void main(String[] args) {


                 for (int i = 1; i <= 4; i++) {
                         char ch='A';

             //(for(int j=i;j<=N;j++) or(j=4;j>=i;j--)

                         for (int j = 1; j <= 4-i+1; j++) {
                                 System.out.print(ch++);

                         }
                         System.out.println();
                 }
         }
 }
//A B C D
//A B C
//A B
//A
