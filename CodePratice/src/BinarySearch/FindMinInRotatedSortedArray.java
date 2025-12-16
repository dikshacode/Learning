package BinarySearch;

public class FindMinInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int n = nums.length;
        int low =0; int high = n-1;
        int ans = Integer.MAX_VALUE;
        if(n==1)
            return nums[0];

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[low] == nums[mid]){
                ans = Math.min(ans,nums[low]);
                low++;
                continue;
            }
            if(nums[low] <= nums[mid] && nums[low] <= nums[mid-1])
            {
                ans = Math.min(ans,nums[low]);
                high = mid - 1;
            }
            else {
                ans = Math.min(ans,nums[mid]);
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int [] arr = {1,1};
        System.out.println(findMin(arr));
    }
}
