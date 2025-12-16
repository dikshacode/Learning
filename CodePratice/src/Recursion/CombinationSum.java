package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
public static void main(String[] args){
    combinationSum(new int[]{2,3,6,7},7);
}
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>result = new ArrayList<>();
        functionCall(0,target,candidates,ans,result);
        return ans;
    }

    public static void  functionCall(int ind, int target, int[] candidates, List<List<Integer>> ans, List<Integer> result) {
        if(ind==candidates.length){
            if(target==0)
             ans.add(new ArrayList<>(result));
            return;
        }
        if(candidates[ind] <= target){
            result.add(candidates[ind]);
            functionCall(ind,target-candidates[ind],candidates,ans,result);
            result.remove(result.size()-1);
        }
        functionCall(ind+1,target,candidates,ans,result);
    }
}
