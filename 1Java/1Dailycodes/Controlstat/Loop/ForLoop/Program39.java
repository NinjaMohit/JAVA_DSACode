class Program1{
    public static void main(String[] args){
        int n=10;
        int x=0;
        int y=1;
        int z;
        System.out.println(x);
        System.out.println(y);

        for(int i=2;i<10;i++){
            z=x+y;
            System.out.println(z);
            x=y;
            y=z;

        }

    }
}
