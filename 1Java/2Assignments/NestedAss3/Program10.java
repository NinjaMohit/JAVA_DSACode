class Program10 {
    public static void main(String[] args) {
        int rows = 4;
        int x = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print(x + " ");
                x++;
            }

            System.out.println();
            x--;
        }
    }
}