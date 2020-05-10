package dsa.trees.Problems;

public class Tree4 {
    static Node4 root;
    public static void main(String[] args) {
        Tree4 tree = new Tree4();
        tree.root = new Node4(1);
        tree.root.left = new Node4(2);
        tree.root.right = new Node4(3);
        tree.root.left.left = new Node4(4);
        tree.root.left.right = new Node4(5);
        tree.root.right.left = new Node4(6);
        tree.root.right.right = new Node4(7);
        // tree.root.right.right.left=new Node4(8);
        // tree.root.right.right.right=new Node4(9);
        preOrderTraversal(root);
        
    }

    private static void preOrderTraversal(Node4 node) {

        if (node==null){
            return;
        }

        System.out.print(node.data+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

    }
}
class Node4 {
    int data;
    Node4 left, right;
    Node4(int data) {
        this.data = data;
        left = right = null;
    }
}
