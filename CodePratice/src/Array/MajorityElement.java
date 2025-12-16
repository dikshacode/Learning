package Array;

public class MajorityElement {
    public static  int majorityElement(int[] nums) {

        int count =1; int majority = nums[0];
        int n = nums.length;
        for(int i = 1; i < n;i++){
            if(majority==nums[i])
                count++;
            else if(count==0){
                majority = nums[i];
                count =1;
            }
            else{
                count--;
            }
        }
        return majority;
    }
    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.print(majorityElement(nums));
    }
}
