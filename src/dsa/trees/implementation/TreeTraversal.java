package dsa.trees.implementation;

import java.util.LinkedList;
import java.util.Queue;

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
        System.out.println("");
        System.out.println("Height of Tree: " + heightOfTree(root));
        System.out.println("Size of Tree: " + sizeOfTree(root));
        System.out.print("Level Order Traversal: ");
        levelOrderTraversal(root);
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


    private static int heightOfTree(Node node) {
        if (node == null)
            return -1;
        else {
            int leftHeight = heightOfTree(node.left);
            int rightHeight = heightOfTree(node.right);
            if (leftHeight > rightHeight)
                return leftHeight + 1;
            else
                return rightHeight + 1;
        }
    }


    private static int sizeOfTree(Node node) {
        if (node == null)
            return 0;
        else {
            int leftSizeOfTree = sizeOfTree(node.left);
            int rightSizeOfTree = sizeOfTree(node.right);
            return leftSizeOfTree + rightSizeOfTree + 1;
        }
    }

    private static void levelOrderTraversal(Node node){

        if (node==null)
            return;

        Queue<Node> queue=new LinkedList<Node>();

        queue.add(node);

        while (!queue.isEmpty()){

            Node node1=queue.remove();
            System.out.print(node1.data+" ");
            if (node1.left!=null){
                queue.add(node1.left);
            }
            if (node1.right!=null){
                queue.add(node1.right);
            }



        }




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
