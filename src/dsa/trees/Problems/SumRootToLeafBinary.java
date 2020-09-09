package dsa.trees.Problems;

public class SumRootToLeafBinary {


        static int op;
        public int sumRootToLeaf(TreeNode root) {
            op=0;
            if(root==null)return 0;
            helper(root,0);
            return op;
        }
        private static void helper(TreeNode root,int ans){
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
