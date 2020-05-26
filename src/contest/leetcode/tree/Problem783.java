package contest.leetcode.tree;
//https://leetcode.com/problems/minimum-distance-between-bst-nodes/
public class Problem783 {

    int mins=Integer.MAX_VALUE,prev=-1;

    public int minDiffInBST(TreeNode root) {

        if(root.left!=null)
            minDiffInBST(root.left);
        if(prev!=-1)
            mins=Math.min(mins,root.val-prev);
        prev=root.val;

        if(root.right!=null)
            minDiffInBST(root.right);


        return mins;
    }


}
