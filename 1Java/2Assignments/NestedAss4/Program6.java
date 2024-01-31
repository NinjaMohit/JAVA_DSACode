/*
1 
2 3 
3 4 5 
4 5 6 7 
*/



 class Pract46 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            int num2=num;
            for (int j = 1; j <= i; j++) {
                System.out.print(num2 + " ");
                num2 ++;
            }
            System.out.println();
            num++;
        }
    }
}

