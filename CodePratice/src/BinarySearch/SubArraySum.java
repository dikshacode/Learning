package BinarySearch;

public class SubArraySum {
    static int findCountOfSunArray(int[] arr,int b){
        int low = 0;
        int high = arr.length-1;
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(checkMaxLen(arr,mid,b)){
                ans = Math.max(ans,arr[mid]);
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
    return ans;
    }
    static boolean checkMaxLen(int[] arr,int k,int b){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i=1;i<=k;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        if(prefixSum[k] <= b) {
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int b = 20;
        findCountOfSunArray(arr,b);
    }
}
