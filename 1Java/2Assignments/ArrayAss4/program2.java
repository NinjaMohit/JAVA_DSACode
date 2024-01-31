 //153
 class program2 {
  public static void main(String[] args) {
    int num=153;
    int temp2=num;
    int temp=num;int count=0;int sum=0;
    while(temp>0){
          count++;
         temp=temp/10;
    }
    System.out.println(count);

    while(temp2>0){
        int rem=temp2%10;
        int mul=1;

        for(int i=1;i<=count;i++){
            mul=mul*rem;
            System.out.println(mul);
        }
        sum=sum+mul;
        temp2=temp2/10;

    }
    System.out.println(sum);
    if(num==sum){
        System.out.println("Armstrong no");
    }

  }
    
}
