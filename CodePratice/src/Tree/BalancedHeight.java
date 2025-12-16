package Tree;

public class BalancedHeight {
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);;
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
       System.out.print(isBalanced(root));
    }
    public static boolean isBalanced(TreeNode root) {
        boolean leftNode = checkNode(root.left);
        boolean rightNode = checkNode(root.right) ;
        if(!leftNode||!rightNode)
            return false;
        int h = height(root);
        return h == 1;
    }
    static int height(TreeNode root){
        if(root==null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        int diff = lh - rh;
        if(diff > 1)
            return 1;
        return 0;
    }
    static boolean checkNode(TreeNode root){
        return root != null;
    }
}
