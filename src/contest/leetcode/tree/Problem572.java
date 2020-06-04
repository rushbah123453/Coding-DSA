package contest.leetcode.tree;
//https://leetcode.com/problems/subtree-of-another-tree/
public class Problem572 {

    public boolean isSubtree(TreeNode s, TreeNode t) {

        if(s==null)
            return false;

        return helper(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public boolean helper(TreeNode s, TreeNode t){


        if(s==null && t==null)
            return true;
        if(s==null || t==null)
            return false;
        if(s.val==t.val)
            return helper(s.left,t.left) && helper(s.right,t.right);
        else
            return false;
    }

}
