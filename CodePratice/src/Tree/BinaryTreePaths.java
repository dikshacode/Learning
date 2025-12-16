package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);;
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        System.out.print(binaryTreePaths(root));
    }
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<String>();
        if (root!= null)  getPath(root,"",answer);
        return answer;
    }
    static void  getPath(TreeNode root,String path,List<String> answer){
        if(root.left==null && root.right==null)
            answer.add(path+root.val);

        if(root.left!=null)
            getPath(root.left,path+root.val+"->",answer);
        if(root.right!=null){
            getPath( root.right,path+root.val+"->",answer);
        }
    }
}
