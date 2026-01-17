package sorting;

import java.util.Arrays;

public class MeetingRoom {
    public static void main(String[] args){
        int[][] arr = {{2, 4}, {9, 12}, {6 ,10}};
        System.out.println(canAttend(arr));
    }
    static boolean canAttend(int[][] arr) {
        // code here
        Arrays.sort(arr,(a, b)->Integer.compare(a[0],b[0]));
        int[] prev = arr[0];
        for(int i=1;i<arr.length;i++){
            int[] curr = arr[i];
            if(prev[1] < curr[0]) {
                prev[1] = Math.max(curr[1],prev[1]);
            }
            else{
                
            }
                return false;
        }
        return true;
    }
}
