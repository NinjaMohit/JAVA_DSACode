//Second MAximum in ARRAY



public class program6 {
    public static void main(String[] args) {
        int arr[]=new int[]{8,4,1,3,9,2,6,7};
          int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                ans=max;
                max=arr[i];
            }
        }

        System.out.println(ans);
    }
}
       