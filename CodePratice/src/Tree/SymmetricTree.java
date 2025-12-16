package Tree;

public class SymmetricTree {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);;
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.left.right = new TreeNode(7);
        System.out.print(isSymmetric(root));
    }
    public static boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        if(root.left==null && root.right!=null)
            return false;

        if(root.left!=null && root.right==null)
            return false;

        if(root.left.val==root.right.val)
            return isSymmetric( root.right);
       return false;

    }
}
