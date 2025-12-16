package BinarySearch;

public class SearchInRotatedSorted {
    static int findElement(int[] arr,int target){
        int low =0; int high = arr.length-1;
        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid]==target){
                return mid;
            }
             if (arr[low] <= arr[mid]) {
                if(arr[low] <= target && (target <=arr[mid])){
                    high = mid -1;
                }
                else {
                    low = mid +1;
                }
            }
            else {
                if(target < arr[high] && target > arr[mid])
                    low = mid+1;
                else
                    high = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] atgs){
        int[] arr = {4,5,6,7,0,1,2};//{1,0,1,1,1};
        System.out.println(findElement(arr,0));
    }
}
