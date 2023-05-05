class Program30 {
    public static void main(String[] args) {
        int i = 0;
        
        int sum=0;int mul=1;
        while (i <= 10) {
            if (i % 2 == 0) {
                sum = sum+i;
            } else {
                mul =mul* i;
            }
            i++;
        }

        System.out.println("sum of even no between 1 to 10:"+sum);
        System.out.println("mul of odd no between 1 to 10:"+mul);

    }
}

