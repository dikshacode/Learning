package Tree;

public class ConstructedBinaryTreeFromArray {
    public static void main(String[] args){
        int[] num = {-10,-3,0,5,9};
        sortedArrayToBST(num);
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        int left = 0; int right = nums.length-1;
        return constructTree(nums,left,right);
    }
    static TreeNode constructTree(int[] nums, int left, int right){
        if(left > right)
            return null;
        int x = right - left;
        int mid = left + x/2;
        TreeNode root = new TreeNode(nums[mid]);
        System.out.print("root--"+root.val+" ");
        root.left = constructTree(nums,left,mid-1);
        root.right = constructTree(nums,mid+1,right);

        return root;
    }
}
