package dsa.trees.Problems.questions;



public class SumRootToLeafBinary {


        static int op;
        public int sumRootToLeaf(TreeNodes root) {
            op=0;
            if(root==null)return 0;
            helper(root,0);
            return op;
        }
        private static void helper(TreeNodes root,int ans){
            if(root.left==null && root.right==null){
                ans=2*ans+root.val;
                op=op+ans;
                return;
            }
            ans=2*ans+root.val;
            if(root.left!=null)
                helper(root.left,ans);
            if(root.right!=null)
                helper(root.right,ans);

        }

}
class TreeNodes {
    public TreeNodes left;
    public TreeNodes right;
    public int val;



    TreeNodes() {}
    TreeNodes(int val) { this.val = val; }
    TreeNodes(int val, TreeNodes left, TreeNodes right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}