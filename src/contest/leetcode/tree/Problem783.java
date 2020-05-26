package contest.leetcode.tree;
//https://leetcode.com/problems/minimum-distance-between-bst-nodes/
public class Problem783 {

    int min=Integer.MAX_VALUE,prev=-1;

    public int minDiffInBST(TreeNode root) {

        if(root.left!=null)
            minDiffInBST(root.left);
        if(prev!=-1)
            min=Math.min(min,root.val-prev);
        prev=root.val;

        if(root.right!=null)
            minDiffInBST(root.right);


        return min;
    }


}
