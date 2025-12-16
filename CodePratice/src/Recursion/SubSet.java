package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args){
        List<List<Integer>> allSubSet = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        getAllSubSet(new ArrayList<>(List.of(1,2,3)), 0, ans, allSubSet);
       // allSubSet.stream().flatMap().forEach(i->System.out.println(i.toString()));
    }
    static void getAllSubSet(List<Integer> nums, int i,List<Integer> ans,List<List<Integer>>allSubSet){
        if(i==nums.size()){
            allSubSet.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums.get(i));
        getAllSubSet(nums,i+1,ans,allSubSet);
        ans.remove(ans.size()-1);
        getAllSubSet(nums,i+1,ans,allSubSet); // exclude
    }
}
