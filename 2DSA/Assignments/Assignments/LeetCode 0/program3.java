//Search insert position

import java.util.Scanner;

class program3 {
    public static  int searchInsert(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else if(nums[i]>target){
                return i;
            }
           
        }
        return nums.length;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int nums[]=new int[]{1,3,5,6};
        int target=sc.nextInt();

           System.out.println(searchInsert(nums, target));
    }
}