package hashing;

import java.util.*;


public class FindPairSumExitsInArray {
    public static void main(String[] args){
        int[] arr = {2, 8, 7, 1, 5};
        List<List<Integer>> ans = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i < arr.length; i++){
            map.put(arr[i],i);
        }

        for(int i=0; i < arr.length; i++){
            for(int j=i+1; j < arr.length; j++){
                int sum = arr[i] + arr[j];
                if(map.containsKey(sum)) {
                    List<Integer> result = new ArrayList<>();
                    result.add(arr[i]);
                    result.add(arr[j]);
                    ans.add(result);
                }
            }
        }
        System.out.println(ans);
    }
}
