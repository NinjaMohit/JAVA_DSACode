public class program3 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4};
        int k=2;
        int n=arr.length;
        int nums[]=new int[n];
        for(int i=0;i<arr.length;i++){
            nums[(i+k)%n]=arr[i];
        }
        arr=nums;

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }
}
