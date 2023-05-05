 class Pract50 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            int num2 = num;
            for (int j = 1; j <= i; j++) {

                if (i % 2 != 0) {

                    if (j % 2 == 0) {
                        System.out.print(num2 * num2 * num2 + "  ");
                    } else {
                        System.out.print(num2 * num2 + " ");
                    }
                } else { 
                    if (j % 2 != 0) {
                        System.out.print(num2 * num2 * num2 + " ");
                    } else {
                        System.out.print(num2 * num2 + " ");
                    }
                }
                num2++;
            }
            num++;
            System.out.println();
        }
    }
}