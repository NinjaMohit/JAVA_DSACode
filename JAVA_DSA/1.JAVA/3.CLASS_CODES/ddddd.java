class Program1{
    public static void main(String[] args) {
           int Num=25;
           while (Num != 0) {

            int Square = Num * Num;
            int s2 = Square;
            int temp = Num;
            int reverse1 = 0;
            int reverse2 = 0;
            while (temp != 0) {
                int rem = temp % 10;
                int rem2 = s2 % 10;
                reverse1 = reverse1 * 10 + rem;
                reverse2 = reverse2 * 10 + rem2;
                temp /= 10;
                s2 /= 10;
            }
            if (reverse1 == reverse2)
            {
                System.out.println("Automorphic number");
            }
            else
            {
                System.out.println("Not a Automorphic number");
            }
        }
    }
}
