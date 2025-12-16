package BinarySearch;

public class LocalMinima {
    static int localMinima(int[] arr){
        int n = arr.length;
        int ans = -1;
        int low = 1;
        int high = n-2;

        if(arr[0]<arr[1]) {
            ans = 0;
            return ans;
        }
         if(arr[n-1] < arr[n-2]){
             ans = n-1;
             return ans;
            }
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] < arr[mid-1] && (arr[mid] < arr[mid+1])){
                ans = mid;
                return ans;
            }
            else if(arr[mid] > arr[mid-1]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {9, 6, 3, 14, 5, 7, 4};
        System.out.println(localMinima(arr));
    }
}
