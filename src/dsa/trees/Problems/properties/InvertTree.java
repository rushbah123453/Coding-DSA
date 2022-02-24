package dsa.trees.Problems.properties;

public class InvertTree {
    private static Node root;

    public static void main(String[] args) {
        InvertTree tree = new InvertTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        /* print inorder traversal of the input tree */
        System.out.println("Inorder traversal of input tree is :");
        tree.inOrder(tree.root);
        System.out.println("");

        /* convert tree to its mirror */
        tree.invertBT(tree.root);

        /* print inorder traversal of the minor tree */
        System.out.println("Inorder traversal of binary tree is : ");
        tree.inOrder(tree.root);
    }

    private Node invertBT(Node node) {
        if(node == null) return null;
        node.left = invertBT(node.left);
        node.right = invertBT(node.right);
        Node tempNode = node.right;
        node.right = node.left;
        node.left = tempNode;
        return node;
    }

    private void inOrder(Node node) {
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
}

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
