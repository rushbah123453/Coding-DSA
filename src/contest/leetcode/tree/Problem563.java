package contest.leetcode.tree;
//https://leetcode.com/problems/binary-tree-tilt/
public class Problem563 {
    public int findTilt(TreeNode root) {
        int mod=0;
        if(root==null){
            return 0;
        }
        mod=Math.abs(helper(root.left)-helper(root.right))+findTilt(root.left)+findTilt(root.right);

        return mod;


    }



    private static int helper(TreeNode root){
        if(root==null)
            return 0;


        int left=0;
        int right=0;
        if(root.left!=null)
            left= helper(root.left);
        if(root.right!=null)
            right =helper(root.right);

        return root.val+left+right;
    }
}
