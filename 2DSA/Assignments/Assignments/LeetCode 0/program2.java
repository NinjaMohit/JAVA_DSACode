//TWO SUM
import java.util.*;
class program2{
    public static int[] twoSum(int[] nums, int target) {
        
       
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                  return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
       
        int nums[]=new int[n];
        
        System.out.println("Enter targer");
        int target=sc.nextInt();
        
         System.out.println("enter array");
        for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
        }

        int arr[]=twoSum(nums,target);

        for(int i=0;i<arr.length;i++){
            System.out.println("Rane is "+arr[i]);
        }

    }
}