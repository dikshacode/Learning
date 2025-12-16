package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Tree.TreeTraversal.postOrderTraversal;
import static Tree.TreeTraversal.preOrderTraversal;

public class ConstructTreeFromPreOrderInOrder {

    public static void main(String[] args){
        int[] inorder = {1, 6, 8, 7};
        int[] preorder = {1, 6, 7, 8};
        buildTree(inorder,preorder);
    }
    public static TreeNode buildTree(int[] inorder, int[] preorder) {
        int Is = 0;int Ie = inorder.length-1;int Ps =0;int Pe = preorder.length-1;
        TreeNode root =  constructTree(inorder,preorder,Is,Ie,Ps,Pe);
        //TreeNode ans = new TreeNode();
        List<Integer> ans = new ArrayList<>();
        ans =  postOrderTraversal(root,ans);
        return root;
    }
    static TreeNode constructTree(int[] inorder, int[] preorder,int Is,int Ie,int Ps,int Pe) {
        if(Ps>Pe)
            return null;
        System.out.println(Ps);
        TreeNode root = new TreeNode(preorder[Ps]);
        Map<Integer,Integer> map = getIndex(inorder);
        int idx =0;
        if(map.containsKey(preorder[Ps])) {
            idx = map.get(preorder[Ps]);
        }
            int x = idx-Is;
        root.left =  constructTree(inorder,preorder,Is,idx-1,Ps+1,Ps+x);
        root.right = constructTree(inorder,preorder,idx+1,Ie,Ps+x+1,Pe);
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
