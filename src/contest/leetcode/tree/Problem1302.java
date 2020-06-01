package contest.leetcode.tree;
//https://leetcode.com/problems/deepest-leaves-sum/
public class Problem1302 {

    int add=0;
    public int deepestLeavesSum(TreeNode root) {
        add=0;
        int h=height(root);
        helper(root,h,0);
        return add;

    }

    public void helper(TreeNode root,int h,int currentHeight){

        if(root==null){
            return ;
        }

        if(h==currentHeight){
            add+=root.val;
        }

        helper(root.left,h,currentHeight+1);

        helper(root.right,h,currentHeight+1);


    }

    public int height(TreeNode root){

        if(root==null)
            return -1;

        return Math.max(height(root.left),height(root.right))+1;

    }
}
