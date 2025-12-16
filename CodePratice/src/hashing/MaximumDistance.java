package hashing;

import java.util.HashMap;

public class MaximumDistance {

        public static void main(String[] args) {
        int[] arr = {1,2, 3, 6, 1, 2,3,2,1,1};
        int len =findMaxDistance(arr);
        System.out.println(len);
    }
        static int findMaxDistance(int[] arr){
        int maxLen = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]))
            {
                int currLen =  i - map.get(arr[i]);
                maxLen = Math.max(maxLen,currLen);
            }
            else {
                map.put(arr[i], i);
            }
        }
        return maxLen;
    }

}
