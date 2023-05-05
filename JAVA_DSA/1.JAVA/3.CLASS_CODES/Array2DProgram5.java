class TwoDArray {
                 //this is a jagged array because it doenot create box for 6,8,9 element and give error if access but in normal 2Darray it create box of zero 
    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30}, {30, 40}, {50}};
        System.out.println(arr.length);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {              //ArrayIndex out of bound 6,8,9
                System.out.println(arr[i][j]);
            }
        }
    
	//For each loop
	
	for(int[] x:arr){
		for(int y:x){
			System.out.print(y);
		}
		System.out.println();

	}
}}
