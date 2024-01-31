class Program1 {//Strong Number program
    public static void main(String[] args) {
        int N= 145;
        int temp= N;
        int sum=0;


        while (N > 0) {
            int rem= N % 10;
            int fact=1;

            for (int i = 1; i <= rem; i++) {
               fact=fact*i;
            }
            sum = sum + fact;
            N = N / 10;
        }
        if (sum == temp) {
            System.out.println("Strong No");
        } else {
            System.out.println("Not strong  No");
        }
    }
}
