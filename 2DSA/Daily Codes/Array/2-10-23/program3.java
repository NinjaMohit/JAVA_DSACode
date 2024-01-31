//Return Count of Pair (i,j) with Arr[i]+Arr[j]==k

//N=10  ///Note i!=j
//K=10
public class program3 {
    public static void main(String[] args) {
            int N=10;int K=10;int count=0;

        int arr[]=new int[]{3,5,2,1,-3,7,8,15,6,13};
       /*  for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(arr[i]+arr[j]==K && i!=j){
                   count++;
                }
            }

        }
        System.out.println(count);
        */

       // Optimize Approach

       for(int i=0;i<N;i++){
        for(int j=i+1;j<N;j++){
            if(i!=j){
                if(arr[i]+arr[j]==K){                                //TC O(N2)
                                                                     //SC=O(1)
                    count++;
                }
            }
        }
       }
       System.out.println(count*2);
        
    }
}
