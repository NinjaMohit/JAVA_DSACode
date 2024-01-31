class program4{
    static int fun(int n){
        if (n<=1) {
            return n;
        }
        else{
            return fun(n-1)+fun(n-2);
        }
    }
    public static void main(String[] args) {
        int n=10;
    for(int i=0;i<n;i++){
        System.out.println(fun(i)+ " ");
    }

}
}