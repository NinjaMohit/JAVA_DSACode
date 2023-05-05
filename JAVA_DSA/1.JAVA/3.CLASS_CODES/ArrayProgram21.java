class ArrayProgram21{

            static void fun(int xarr[]){
		    for(int x:xarr){
			    System.out.println(x);
		    }
		    xarr[0]=50;
	    }

	public static void main(String[] args){
         	int arr[]={10,20,30,40,50};
		for(int x:arr){
		System.out.println(x);
		
		}
		fun(arr);

		for(int x:arr){
			System.out.println(x);
		}
	}
}

