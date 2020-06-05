package contest.leetcode.tree;
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
public class Problem235 {



//Optimized approach
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // Value of current node or parent node. ->100% faster
        int parentVal = root.val;

        // Value of p
        int pVal = p.val;

        // Value of q;
        int qVal = q.val;

        if (pVal > parentVal && qVal > parentVal) {
            // If both p and q are greater than parent
            return lowestCommonAncestor(root.right, p, q);
        } else if (pVal < parentVal && qVal < parentVal) {
            // If both p and q are lesser than parent
            return lowestCommonAncestor(root.left, p, q);
        } else {
            // We have found the split point, i.e. the LCA node.
            return root;
        }
    }





    //Own approach -> 8% faster
    int min=Integer.MAX_VALUE;
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null)
            return new TreeNode(min);

        if(helper(root,p.val) && helper(root,q.val)){
            min=root.val;
        }
        lowestCommonAncestor2(root.left,p,q);
        lowestCommonAncestor2(root.right,p,q);
        return new TreeNode(min) ;
    }


    public boolean helper(TreeNode root, int x){
        if(root==null)
            return false;
        return (root.val==x) ||  (helper(root.left,x) || helper(root.right,x));
    }

}
