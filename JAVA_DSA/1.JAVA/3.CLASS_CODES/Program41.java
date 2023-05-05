class Program1{
    public static void main(String[] args){
        int N=153;
        int temp1=N;int count=0;
        int temp2=N;int sum=0;
        while(temp1>0){

            count++;
            temp1=temp1/10;
        }
        while(N>0){
            int rem=N%10;
            int mul=1;

            for(int i=1;i<=count;i++){
                mul=mul*rem;
            }
            sum=sum+mul;
            N=N/10;
        }
        if(sum==temp2){
            System.out.println("arm");
        }
    else
    {
        System.out.println("Not");
    }
}
}
