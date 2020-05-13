package contest.leetcode.tree;

public class Tree {

    static TreeNode root;

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);

       // preOrder(root);
        tree2str(root);
    }


    private static void preOrder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }



    public static String tree2str(TreeNode t) {



      String str= treeHelper(t,"");

      return str;
    }

    private static String treeHelper(TreeNode t, String s) {

        if (t==null){
            return ")";
        }


        s=s+t.val;
        s=s+treeHelper(t.left,s+"(");
        s=s+treeHelper(t.right,s+"(");





        return s;
    }


}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}

