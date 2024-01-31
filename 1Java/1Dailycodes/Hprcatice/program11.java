class program2 {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,6,5};
        int min=arr[arr.length-1];int min2=arr[arr.length-1];
      for(int i=arr.length-1;i>0;i--){
            if( min>arr[i]&& i%2==1){
                min2=min;
                min=arr[i];
            }
//	 System.out.println(min);   
             if( min2>arr[i] && min!=arr[i]&& i%2==1){
              
                min2=arr[i];
            }    
    }   System.out.println(" min2 value is "+min2);
    
    }
}
