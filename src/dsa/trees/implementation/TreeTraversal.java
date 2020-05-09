package dsa.trees.implementation;

public class TreeTraversal {

    static Node root;

    TreeTraversal() {
        this.root = null;
    }

    public static void main(String[] args) {

        TreeTraversal treeTraversal = new TreeTraversal();
        treeTraversal.root = new Node(1);
        treeTraversal.root.left = new Node(2);
        treeTraversal.root.right = new Node(3);

        treeTraversal.root.left.left = new Node(4);
        treeTraversal.root.left.right = new Node(5);

        treeTraversal.root.right.left = new Node(6);
        treeTraversal.root.right.right = new Node(7);
        System.out.print("PreOrder: ");
        preOrderTraversal(root);
        System.out.println("");
        System.out.print("InOrder: ");
        inOrderTraversal(root);
        System.out.println("");
        System.out.print("PostOrder: ");
        postOrderTraversal(root);


    }


    public static void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

    }


    public static void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }


    private static void postOrderTraversal(Node node) {

        if (node == null)
            return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");

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
