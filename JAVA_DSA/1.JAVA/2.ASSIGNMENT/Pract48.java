public class Pract48 {
    public static void main(String[] args){
        int num=10;char ch='J';
        for(int i=1;i<=4;i++) {


            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(ch+" ");

                }
                else{
                    System.out.print(num+" ");

                }
                ch--;
                num--;
            }
            System.out.println();

        }
    }
}
