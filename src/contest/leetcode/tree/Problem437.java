package contest.leetcode.tree;
//https://leetcode.com/problems/path-sum-iii/
public class Problem437 {

    public  int res=0;
    public int pathSum(TreeNode root, int sum) {
        if(root!=null){
            helper(root,sum,0);
            pathSum(root.left,sum);
            pathSum(root.right,sum);

        }
        // System.out.println("res= "+res);
        return res;
    }


    public  void helper(TreeNode root, int sum,int val){
        if(root==null){
            return;
        }
        val+=root.val;
        //System.out.println("val = "+val);
        if(val==sum){
            res+=1;
            // System.out.println("res in val = "+res);
        }
        helper(root.left,sum,val);
        helper(root.right,sum,val);
    }
}

// optimized solution by br4in5torm
class Solution {
    int result = 0;
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        helper(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return result;
    }

    public void helper(TreeNode root, int sum) {
        if (root == null) return;
        if (sum - root.val == 0) result+=1;
        helper(root.left, sum-root.val);
        helper(root.right, sum-root.val);
    }
}