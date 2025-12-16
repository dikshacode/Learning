package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisapperedNumberFromArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        int n = 10;
        List<Integer> list = new ArrayList<Integer>();
        for(int i:nums){
            map.put(i,true);
        }
        for(int j = 1;j<=nums.length;j++){
            if(!map.containsKey(j)){
                list.add(j);

            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] arr = {1,1};
        List<Integer> list = findDisappearedNumbers(arr);
        System.out.println(list);

    }
}
