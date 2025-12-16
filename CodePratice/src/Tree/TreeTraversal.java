package Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversal {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = null;
        TreeNode right = new TreeNode(2);
        root.right = right;
        root.right.left = new TreeNode(3);
        List<Integer> ans = new ArrayList<>();
       // preOrderTraversal(root,ans);
        //inOrderTraversal(root,ans);
        postOrderTraversal(root,ans);
    }
    static List<Integer> preOrderTraversal(TreeNode root ,List<Integer> ans){
        if(root==null)
            return new ArrayList<>();
        ans.add(root.val);
        preOrderTraversal(root.left,ans);
        preOrderTraversal(root.right,ans);
        return ans;
    }
    static List<Integer> inOrderTraversal(TreeNode root ,List<Integer> ans){
        if(root==null){
            return new ArrayList<>();
        }
        inOrderTraversal(root.left,ans);
        ans.add(root.val);
        inOrderTraversal(root.right,ans);
        return ans;
    }

    static List<Integer> postOrderTraversal(TreeNode root ,List<Integer> ans){
        if(root==null){
            return new ArrayList<>();
        }
        postOrderTraversal(root.left, ans);
        postOrderTraversal(root.right, ans);
        ans.add(root.val);

        return ans;
    }
}
