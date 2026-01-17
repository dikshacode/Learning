package BinarySearch;

public class CapacityToShipPackages {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10}; int m = 5;
        System.out.println(noOfDaysNeeded(arr,m));
    }

    public static  int noOfDaysNeeded(int[] weight, int d) {
        int n = weight.length;
        int sum =0;
        int min = 0;
        int ans = 0;
        for(int i = 0; i<=n-1;i++){
            sum += weight[i];
            min = Math.max(min,weight[i]);
        }
        int low = min;
        int high = sum;
        while(low <= high) {
            int mid = (low + high) / 2;

            if (chooseWeight(weight, mid, d)) {
                ans = mid;
                high = mid - 1;

            } else
                low = mid + 1;
        }
    return ans;
    }

    private static boolean chooseWeight(int[] weight, int capacity, int d){
        int count = 1;
        int currWght = weight[0];

        for(int i=1; i<weight.length;i++){
            if(currWght + weight[i] > capacity){
                currWght = weight[i];
                count++;
            }
            else{
                currWght += weight[i];
            }
        }

        return count <= d;
    }
}
