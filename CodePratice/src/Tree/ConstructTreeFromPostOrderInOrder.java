package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstructTreeFromPostOrderInOrder {
    public static void main(String[] args){
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        buildTree(inorder,postorder);
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        int Is = 0;int Ie = inorder.length-1;int Ps =0;int Pe = postorder.length-1;
        TreeNode root =  constructTree(inorder,postorder,Is,Ie,Ps,Pe);
        List<Integer> ans = TreeTraversal.preOrderTraversal(root,new ArrayList<>());
        System.out.print(ans);
        return root;
    }
    static TreeNode constructTree(int[] inorder, int[] postorder, int is, int ie, int ps, int pe) {
        if(is > ie)
            return null;
        TreeNode root = new TreeNode(pe);
        Map<Integer,Integer> map = getIndex(inorder);
        int idx =0;
        if(map.containsKey(postorder[pe]))
            idx = map.get(postorder[pe]);
        int x = idx-is;
        root.left =  constructTree(inorder,postorder,is,idx-1,ps,ps+x-1);
        root.right = constructTree(inorder,postorder,idx+1,ie,ps+x,pe-1);
        return root;
    }

    static Map<Integer,Integer> getIndex(int[] inorder){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return map;
    }
}
