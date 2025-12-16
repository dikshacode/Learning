package Tree;

public class SumRootToLeave {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int sum = 0;
        int x = getRootValLeft(root,sum);
        int y = getRootValRight(root,sum);
        System.out.print("Sum from root to node"+x+y);
    }
    static int getRootValLeft(TreeNode root, int sum){
        if(root==null)
            return sum;
        int val = root.val;
        sum = (sum*10) + val;
      return getRootValLeft(root.left,  sum);
    }
    static int getRootValRight(TreeNode root, int sum){
        if(root==null)
            return sum;
        int val = root.val;
        sum = (sum*10) + val;
        return getRootValRight(root.right,  sum);
    }
}
