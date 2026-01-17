package BinarySearch;

public class FirstAndLastOccurrence {
    static int[] findOccurence(int[] nums,int target){
        int s =0; int e = nums.length-1;
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        while(s<=e){
            int mid = (e+s)/2;
            if(nums[mid] == target){
                firstOccurrence = mid;
                e = mid-1;
            }
            if(nums[mid] < target){
                s = mid+1;
            }
            else
                e = mid-1;
        }
        // lastOccurrence
        s =0; e = nums.length-1;
        while(s<=e){
            int mid = (e+s)/2;
            if(nums[mid] == target){
                lastOccurrence = mid;
                s = mid+1;
            }
            if(nums[mid] < target){
                s=mid+1;
            }
            else
                e= mid-1;
        }

        return new int[]{firstOccurrence,lastOccurrence};
    }
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(findOccurence(arr,target));
    }
}
