package dsa.trees.Problems.constructTree;

public class ConstructFromSortedArray {
    private static Node root;
    public static void main(String[] main) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        ConstructFromSortedArray tree = new ConstructFromSortedArray();
        root = tree.constructTree(arr, 0, arr.length - 1);
        System.out.print("Preorder Tree nodes: ");
        tree.printTreePreorder(root);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if(start > end) {
            return null;
        }
        // middle element will be root of main tree and all subtree
        int middle = start + (end - start) / 2;
        Node node = new Node(arr[middle]);

        // left child of root will be middle of first half of elements
        node.left = constructTree(arr, start, middle - 1);
        // right child of root will be middle of second half of elements
        node.right = constructTree(arr, middle + 1, end);
        return node;
    }

    private void printTreePreorder(Node node) {
        if(node == null) return;
        System.out.print(node.data + " ");
        printTreePreorder(node.left);
        printTreePreorder(node.right);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
