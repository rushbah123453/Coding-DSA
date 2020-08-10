package companyCodingQuestion.CompanyPrep.Amazon;

public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        return subheight(root)-1;
    }

    private static int subheight(TreeNode root){
        if(root==null) return 0;
        int leftTree=height(root.left);
        int rightTree=height(root.right);
        return Math.max(leftTree+rightTree+1,Math.max(subheight(root.left),subheight(root.right)));

    }

    private static int height(TreeNode node){
        if(node==null) return 0;
        return 1+Math.max(height(node.left),height(node.right));
    }
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
