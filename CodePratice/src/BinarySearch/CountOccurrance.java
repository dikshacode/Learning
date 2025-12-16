package BinarySearch;

public class CountOccurrance {
    static int findOccurrence(int[] arr,int target){
       int low = 0; int high =arr.length-1;
        int left = -1; int right =-1;
       while(low <= high){
           int mid = low + (high - low)/2;

           if(arr[mid]==target){
               left = mid;
               high = mid-1;
           }
           else if(arr[mid] < target){
               low = mid + 1;
           }
            else{
               high = mid-1;
           }
       }
       low =0;high= arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid]==target){
                right = mid;
                low = mid+1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return right - left +1;
    }
    public static void main(String[] args){
        int[] arr = {1, 1, 2, 2, 2, 2, 3};//{4, 4, 8, 8, 8, 15, 16, 23, 23, 42};
        int target = 2;
        System.out.println(findOccurrence(arr,target));
    }
}
