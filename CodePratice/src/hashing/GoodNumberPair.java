package hashing;

import java.util.*;


public class GoodNumberPair {
    public static void main(String[] args){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] nums = {1,2,3,1,1,3};
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            else
            map.put(nums[i],1);
        }
        int ans =0;
        Collection<Integer>  list = map.values();
        for(Integer val : list){
            ans += (val *(val-1))/2;
        }
        System.out.println(ans);

    }
}
