package BinarySearch;

import java.util.Arrays;

public class MagneticForceBetweenBalls {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,7}; int m = 3;
        System.out.println(maxDistance(arr,m));
    }

    public static  int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int minGap = 1;
        int n = position.length;
        int maxGap = position[n-1] - position[0];
        int low = minGap;
        int high = maxGap;
        int ans = 0;
        while (low <= high){
            int mid = (low+high)/2;
            if(checkPossiblities(position,mid,m)) {
                low = mid + 1;
                ans = mid;
            }
            else
                high = mid -1;
        }
        return ans;
    }

    public static boolean checkPossiblities(int[] position, int mid, int m){
        int key = position[0];
        int count = 1;
        for(int i=0; i < position.length;i++){
            if(position[i]  - key >=mid){
                key = position[i];
                count++;
            }
            if(count >=m)
                return true;
        }
        return false;
    }
}
