package Tree;

public class Height {
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);;
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
       int h = height(root);
       System.out.print(h);
    }
    static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return 1+Math.max(lh,rh);
    }
}
