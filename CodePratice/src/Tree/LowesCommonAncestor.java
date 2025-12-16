package Tree;

public class LowesCommonAncestor {

    public static void main(String[] args){
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);;
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        System.out.println(lowestCommonAncestor(root,2,4).val);
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        if(root==null || root.val==p || root.val==q)
            return root;
        TreeNode left= lowestCommonAncestor(root.left,p,q);
        TreeNode right= lowestCommonAncestor(root.right,p,q);

        if(left==null)
            return right;
        else if(right==null)
            return left;

        return root;
    }
}
