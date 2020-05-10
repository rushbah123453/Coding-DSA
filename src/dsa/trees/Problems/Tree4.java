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
        System.out.println("");
        postOrderTraversal(root);
        System.out.println("");
        System.out.println("size of tree "+calculateSize(root));
        
    }

    private static int calculateSize(Node4 node) {

        if (node==null)
            return 0;
        else {
            int leftSubtreeSize=calculateSize(node.left);
            int rightSubtreeSizet=calculateSize(node.right);
            return leftSubtreeSize+rightSubtreeSizet+1;
        }

    }

    private static void postOrderTraversal(Node4 node) {
        if (node==null)
            return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data+" ");;
    }

    private static void preOrderTraversal(Node4 node) {
        if (node==null){
            return;
        }
        System.out.print(node.data+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }



   static Node4 searchInBST(Node4 node, int key) {
       if (node==null || node.data==key)
           return node;

       if (key<node.data){
         return   searchInBST(node.left,key);
       }else {
          return searchInBST(node.right,key);
       }

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
