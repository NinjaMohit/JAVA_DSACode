class Pract47 {
         public static void main(String[] args) {
             int num = 1;char ch='F';
             for (int i = 1; i <= 6; i++) {
                 char ch2=ch;
                 for (int j = 1; j <= i; j++) {
                     if (j % 2 == 0) {
                         System.out.print(num + " ");
                         num++;
                     }
                     else{
                         System.out.print(ch2+++" ");

                     }
                 }
                 System.out.println();
                 ch--;
             }
         }
     }


