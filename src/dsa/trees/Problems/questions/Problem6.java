package dsa.trees.Problems.questions;
//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class Problem6 {
    public static void main(String[] args) {
        Problem5 tree = new Problem5();
        tree.root = new Node5(9);
        tree.root.left = new Node5(7);
        tree.root.right = new Node5(5);
        tree.root.left.left = new Node5(2);
        tree.root.left.left.right = new Node5(3);
        System.out.println(maxDepth(tree.root));
    }

    private static int maxDepth(Node5 node) {

        if (node==null){
            return 0;
        }

        else {

            int leftSubtreeHeight=maxDepth(node.left);
            int rightSubtreeHeight=maxDepth(node.right);

            if (leftSubtreeHeight>rightSubtreeHeight)
                return leftSubtreeHeight+1;
            else
                return rightSubtreeHeight+1;


        }

    }
}
