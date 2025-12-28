package Recursion;

public class SubSetSum {
    public static void main(String[] args){
        int sum = getAllSubSetSum(new int[]{20,2,25},0,35);
        System.out.println(sum);
    }
    static int getAllSubSetSum(int[] nums, int i, int sum){
        if(i==nums.length){

            return (sum==0) ? 1:0;
        }
        return getAllSubSetSum(nums,i+1,sum - nums[i]) +getAllSubSetSum(nums,i+1,sum ); // exclude
    }
}
