package hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithZeroSum {
public static int maxLength(int[] arr){
    Map<Integer,Integer> map = new HashMap<>();
    int len = 0;
    int sum = 0;

    for(int i=0;i<arr.length;i++){
        sum += arr[i];
        if(sum == 0){
            len = i+1;
        }
        else{
            if(map.get(sum) != null){
                len = Math.max(len, i - map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
    }
    return len;
}
    public static void main(String[] args){
        int[] arr=  {15, -2, 2, -8, 1, 7, 10, 23};//{3, 1, 0, -1};
        System.out.println(maxLength(arr));
    }
}
