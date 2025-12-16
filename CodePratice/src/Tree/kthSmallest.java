package Tree;

import sorting.KthLargest;

import java.util.ArrayList;
import java.util.List;

public class kthSmallest {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = null;
        TreeNode right = new TreeNode(2);
        root.right = right;
        root.right.left = new TreeNode(3);
        System.out.print(kthSmallest(root,3));
    }
    public static int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        ans = inOrderTraversal(root, ans);
        int res = ans.get(k+1);
        return res;
    }
    static List<Integer> inOrderTraversal(TreeNode root ,List<Integer> ans){
        if(root==null){
            return new ArrayList<>();
        }
        //ans.add(root.val);
        inOrderTraversal(root.left,ans);
        ans.add(root.val);
        inOrderTraversal(root.right,ans);
       // ans.add(root.val);
        return ans;
    }
}
