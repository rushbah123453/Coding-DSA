package dsa.trees.Problems.questions;

import java.util.LinkedList;
import java.util.Queue;

public class Tree3 {
    static Node3 root;
    public static void main(String[] args) {
        Tree3 tree = new Tree3();
        tree.root = new Node3(1);
        tree.root.left = new Node3(2);
        tree.root.right = new Node3(3);
        tree.root.left.left = new Node3(4);
        tree.root.left.right = new Node3(5);
        tree.root.right.left = new Node3(6);
        tree.root.right.right = new Node3(7);
        // tree.root.right.right.left=new Node3(8);
        // tree.root.right.right.right=new Node3(9);
        levelOrderTraversal(root);
    }
    private static void levelOrderTraversal(Node3 node) {
        if (node == null)
            return;
        Queue<Node3> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node3 node3 = queue.remove();
            System.out.print(node3.data + " ");
            if (node3.left != null) {
                queue.add(node3.left);
            }
            if (node3.right != null) {
                queue.add(node3.right);
            }
        }
    }
}

class Node3 {
    int data;
    Node3 left, right;
    Node3(int data) {
        this.data = data;
        left = right = null;
    }
}