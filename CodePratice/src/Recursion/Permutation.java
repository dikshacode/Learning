package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        permute(arr);
    }
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans= new ArrayList<>();
        return getPermute(nums,0,ans);

    }

    private static List<List<Integer>> getPermute(int[] nums,int indx,List<List<Integer>>ans){
        for(int i=indx; i < nums.length; i++){
            if(nums.length-1==indx){
                ans.add(Arrays.asList(nums).stream().flatMapToInt(Arrays::stream).boxed().toList());
            }
            swap(nums,indx,i);
            getPermute(nums,indx+1,ans);
            swap(nums,indx,i);
        }
        return ans;
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
