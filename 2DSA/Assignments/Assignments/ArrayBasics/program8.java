/* */

public class program8 {

    static void EvenOccurence(int arr[]){
      
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count%2==0){
                
                System.out.println(arr[i]);   
            }
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{9,12,23,10,12,12,15,23,14,12,15};
        EvenOccurence(arr);

    }
}
