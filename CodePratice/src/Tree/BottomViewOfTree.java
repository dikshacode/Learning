package Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BottomViewOfTree {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(6);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);
        System.out.print(getBottomView(root));
    }
   static boolean getBottomView(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Map<Integer,Integer> map = new HashMap<>();

        root.hd = 0;
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            int hd = temp.hd;
            map.put(hd,temp.val);
            if(temp.left != null){
                temp.left.hd = hd - 1;
                queue.add(temp.left);
            }
            if(temp.right != null){
                temp.right.hd = hd + 1;
                queue.add(temp.right);
            }
        }
        map.forEach((k,v)->System.out.println(v));
       return false;
   }
}
