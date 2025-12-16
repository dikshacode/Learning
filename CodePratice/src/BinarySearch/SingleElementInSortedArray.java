package BinarySearch;

public class SingleElementInSortedArray {

    static int findSingleElement(int[] arr){
        int low =0;
        int high = arr.length-1;


        while (low <= high){
            int mid = (low+high)/2;

            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }
            if (mid%2==0 && (arr[mid] == arr[mid-1])){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(findSingleElement(arr));
    }
}
