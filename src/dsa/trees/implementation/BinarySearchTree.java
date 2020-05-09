package dsa.trees.implementation;

public class BinarySearchTree {
    static Nodes root;

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(50);
        binarySearchTree.add(25);
        binarySearchTree.add(15);
        binarySearchTree.add(75);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        binarySearchTree.add(85);
        binarySearchTree.add(40);
        binarySearchTree.add(23);
        binarySearchTree.add(46);
        binarySearchTree.add(84);
        binarySearchTree.add(90);
        System.out.println("PreOrder: ");
        binarySearchTree.preOrder(root);
        System.out.println("");
        System.out.println("Minimum Value is "+minNode(root));
        System.out.println("Maximum Value is "+maxNode(root));
        search(46);
        search(1003);
    }



    private static void add(int key) {
        root = add(root, key);
    }

    private static Nodes add(Nodes node, int key) {
        if (node == null) {
            node = new Nodes(key);
            return node;
        }

        if (key < node.data) {
            node.left = add(node.left, key);
        } else if (key > node.data) {
            node.right = add(node.right, key);
        }

        return node;
    }


    private static void preOrder(Nodes node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }


    private static int minNode(Nodes node){

        if (node.left==null){
            return node.data;
        }else {
        return  minNode(node.left);
        }

    }

    private static int maxNode(Nodes node) {

        if (node.right==null)
            return node.data;
        else
            return maxNode(node.right);
    }

    private static void search(int key){

      Nodes nodes=  search(root,key);
      if (nodes!=null){
          System.out.println("Element "+nodes.data+" found");
      }else {
          System.out.println("Element "+key+" not found");
      }
    }

    private static Nodes search(Nodes node,int key){
        if (node==null || node.data==key){
            return node;
        }

        if (key>node.data){
            return search(node.right,key);
        }else {
            return search(node.left,key);
        }

    }

}

class Nodes {

    int data;
    Nodes left, right;

    Nodes(int data) {
        this.data = data;
        left = right = null;
    }

}
