//Strong no
class factorial{
	public static void main(String[] args){
        int arr[]=new int[]{22,145,23,44,687};

		for(int j=0;j<arr.length;j++){
		int num=arr[j];
        int temp=num;int sum=0;
		while(temp>0){
			
			int rem=temp%10;
            int fact=1;
			for(int i=1;i<=rem;i++){
                 fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==num)
		System.out.println(sum);

	}
}
}
