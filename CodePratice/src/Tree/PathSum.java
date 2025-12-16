package Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PathSum {
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);;
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
       System.out.println(hasPath(root,30));
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        //hasPath(root,0,30,list,ans);
        //System.out.print(hasPath(root,0,30,list,ans,0));
    }
    private static boolean hasPath(TreeNode root,int targetSum){
        if(root==null)
            return false;
        if(root.left == null && root.right == null){
            return targetSum - root.val==0;
        }
        targetSum -= root.val;
        return hasPath(root.left,targetSum) || hasPath(root.right,targetSum);
    }

    private static void hasPath(TreeNode root,int sum, int targetSum, List<Integer> list, List<List<Integer>> ans){
        if(root==null)
            return;
            sum+= root.val;
            list.add(root.val);
            if(root.left==null && root.right==null && targetSum==sum){
                ans.add(list);
            }
            else {
                hasPath(root.left, sum, targetSum, new ArrayList<>(list), ans);
                hasPath(root.right,sum, targetSum, new ArrayList<>(list), ans);
            }
        return;
    }
    private static int hasPath(TreeNode root,int sum, int targetSum, List<Integer> list, List<List<Integer>> ans,int count){
        if(root==null)
            return count;
        sum+= root.val;
        list.add(root.val);
        if(targetSum==sum)
            count++;
        if(root.left==null && root.right==null && targetSum==sum){
            ans.add(list);
            count++;
        }

        hasPath(root.left, sum, targetSum, new ArrayList<>(list), ans,count);
        hasPath(root.right,sum, targetSum, new ArrayList<>(list), ans,count);

        return count;
    }
}
