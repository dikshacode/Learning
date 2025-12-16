package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountPair {
    public static void main(String[] args){
        int[] nums = {42,11,1,97};
    }
    public static int countNicePairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int pairs = 0;
        int mod = 1000000007;
        for(int i=0;i<nums.length;i++){
            nums[i]= nums[i] - reverse(nums[i]);
        }
        for(int i=0;i< nums.length;i++){
            pairs+=(map.getOrDefault(nums[i],0));
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        pairs %= mod;
        return pairs;
    }
    static int reverse(int n)
    {
        int rev = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }

        return rev;
    }
}
