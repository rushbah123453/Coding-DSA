package dsa.trees.Problems;

public class Tree1 {

    static Node1 root;

    Tree1(){
        root=null;
    }

    public static void main(String[] args) {
        Tree1 tree=new Tree1();
        tree.root=new Node1(1);
        tree.root.left=new Node1(2);
        tree.root.right=new Node1(3);
        tree.root.left.left=new Node1(4);
        tree.root.left.right=new Node1(5);
        tree.root.right.left=new Node1(6);
        tree.root.right.right=new Node1(7);
       // tree.root.right.right.left=new Node1(8);
       // tree.root.right.right.right=new Node1(9);
        System.out.println(calculateHeight(root));

    }

    private static int calculateHeight(Node1 node) {

        //considering root height is 1
        if (node==null){
            return 0;
        }

        else {
            int leftHeightOfSubtree=calculateHeight(node.left);
            int rightHeightOfSubtree=calculateHeight(node.right);
            if (leftHeightOfSubtree>rightHeightOfSubtree)
                return leftHeightOfSubtree+1;
            else
                return rightHeightOfSubtree+1;
        }

    }


}

class Node1{
    int data;
    Node1 left,right;
    Node1(int data){
        this.data=data;
        left=right=null;
    }
}
