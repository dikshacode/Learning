package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinumumDistance {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 6, 1, 2,3,2,1,1};
        int len =findMinDistance(arr);
        System.out.println(len);
    }
    static int findMinDistance(int[] arr){
        int minLen = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int currLen = i - map.get(arr[i]);
                minLen = Math.min(currLen, minLen);
            }
            map.put(arr[i], i);
        }
        return minLen;
    }
}
