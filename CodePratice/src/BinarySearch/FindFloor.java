package BinarySearch;

public class FindFloor {
   static int findFloor(int[] nums, int target){
       int low =0; int high = nums.length-1;
       int floor =Integer.MIN_VALUE;
       while(low <= high){
           int mid = (low+high)/2;
           if(nums[mid] == target){
               return nums[mid];
           }
           else if(nums[mid] < target){
               floor = Math.max(nums[mid],floor);
               low = mid+1;
           }
           else {
               high = mid-1;
           }
       }
      return floor;
    }
    public static void main(String[] args){
        int[] nums ={5, 6, 8, 9, 6, 5, 5, 6};
       System.out.println(findFloor(nums,10));
    }
}
