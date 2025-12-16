package hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    public static int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();
        for(int i =0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        int len = 0;
        int maxLen = Integer.MIN_VALUE;
        for(Integer key : hs){
            if(!hs.contains(key-1)){
                len = 1;
                while(hs.contains(key+1)){
                    key = key +1;
                    len++;
                }
                maxLen = Math.max(maxLen,len);
            }

        }
        return maxLen;
    }
    public static void main(String[] args){
        System.out.print(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
