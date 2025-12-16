package Tree;

public class SumOfLeftLeaves {
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);;
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int sum = sumOfLeftLeaves(root);
        System.out.print(sum);
    }
    public static int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null)
            return root.val;
        if(root.right.left==null)
            return root.left.val;
        int lh = sumOfLeftLeaves(root.left);
        int rh = sumOfLeftLeaves(root.right);
        return lh + rh;
    }
}
