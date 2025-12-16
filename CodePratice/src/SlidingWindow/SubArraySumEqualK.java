package SlidingWindow;

public class SubArraySumEqualK {
    public static int subarraySum(int[] nums, int k) {
        int n  =  nums.length;
        int sum = 0;
        int maxlen =0;
        int low = 0; int heigh = 0;
        while(low < n){
            sum += nums[heigh];
            if(sum == k){
                maxlen = Math.max(maxlen,heigh - low + 1);
            }
            if(sum > k){
                sum -= nums[low];
                low++;
                maxlen = Math.max(maxlen,heigh - low + 1);
            }
            else{
                heigh++;
            }
        }
        return maxlen;
    }
    public static void main(String[] args){
        int [] nums = {1,2,1,2,1};  int k = 3;
        System.out.println( subarraySum(nums,k));
    }
}
