package contest.leetcode.tree;
//https://leetcode.com/problems/binary-tree-pruning/
public class Problem814 {

    public TreeNode pruneTree(TreeNode root) {

        if(root==null)
            return null;

     /*   TreeNode leftSubtree=null;
         if(root!=null){
         leftSubtree=pruneTree(root.left);
        if(root.val==0 && leftSubtree==null)
          return  root=null;
         }


        TreeNode rightSubtree=null;
        if( root!=null){
            rightSubtree=pruneTree(root.right);
            if(rightSubtree==null && root.val==0)
          return root=null;
        }
       */

        root.left =pruneTree(root.left);
        System.out.println("leftSubtree"+ root.val);
        root.right =pruneTree(root.right);

        if(root.val==0 && root.left==null && root.right==null){
            root=null;
            //return  null;
        }
        return root;

    }
}
