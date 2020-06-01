package contest.leetcode.tree;
//https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
public class Problem671 {


    int first;
    long second = Long.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        first = root.val;
        helper(root);
        System.out.println("secondSmallest=" + second);

        if (second < Long.MAX_VALUE)
            return (int) second;
        else
            return -1;
    }


    public void helper(TreeNode root) {

        if (root == null)
            return;


        if (first < root.val && root.val < second) {
            second = root.val;
            System.out.println("secondSmallest= " + second);
        } else if (first == root.val) {
            helper(root.left);
            helper(root.right);
        }


    }
}