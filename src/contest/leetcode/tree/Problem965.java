package contest.leetcode.tree;
//https://leetcode.com/problems/univalued-binary-tree/
public class Problem965 {
    public boolean isUnivalTree(TreeNode root) {

        if(root==null){
            return true;
        }

        return helper(root,root.val);

    }

    public static boolean helper(TreeNode root,int rootVal){

        if(root==null){
            return true;
        }

        if(root.val!=rootVal){
            return false;
        }

        return helper(root.left,rootVal) && helper(root.right,rootVal);

    }
}
