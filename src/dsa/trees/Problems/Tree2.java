package dsa.trees.Problems;

public class Tree2 {

    static Node2 root; 
    public static void main(String[] args) {

        Tree2 tree=new Tree2();
        tree.root=new Node2(1);
        tree.root.left=new Node2(2);
        tree.root.right=new Node2(3);
        tree.root.left.left=new Node2(4);
        tree.root.left.right=new Node2(5);
        tree.root.right.left=new Node2(6);
        tree.root.right.right=new Node2(7);
        // tree.root.right.right.left=new Node2(8);
        // tree.root.right.right.right=new Node2(9);
        inOrderTraversal(root);
    }

    private static void inOrderTraversal(Node2 node) {
        if (node==null){
            return;
        }

        inOrderTraversal(node.left);
        System.out.print(node.data+" ");
        inOrderTraversal(node.right);



    }


}

class Node2 {
    int data;
    Node2 left, right;
    Node2(int data) {
        this.data = data;
        left = right = null;
    }
}
