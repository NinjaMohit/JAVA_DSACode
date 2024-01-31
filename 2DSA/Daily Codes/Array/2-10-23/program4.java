
//Reverse ARray
public class program4 {                 ///for SC O(N)
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};

        int nums[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            nums[arr.length-1-i]=arr[i];              //TC O(N)   SC O(N)
        }

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
    

