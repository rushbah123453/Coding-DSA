package contest.leetcode.tree;
//https://leetcode.com/problems/path-sum/
public class Problem112 {
    static int add;
    public boolean hasPathSum(TreeNode root, int sum) {
        add=0;
        return helper( add, root,  sum);
    }


    public static boolean helper(int add,TreeNode root, int sum){
        if(root==null)
            return false;

        if(root!=null && root.left==null && root.right==null){
            //   System.out.println("leaf="+root.val);
            //    System.out.println("add+root.val="+(add+root.val));
            if((add+root.val)==sum){
                return true;
            }else{
                //  System.out.println("reverse="+root.val);
                return false;
            }
        }


        add+=root.val;
        return  helper(add,root.left,sum) || helper(add,root.right,sum);

    }


}
