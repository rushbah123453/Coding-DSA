package dsa.trees.Problems;

import java.util.LinkedList;
import java.util.Queue;

public class Problem5 {

    static Node5 root;
    public static void main(String[] args) {
        Problem5 tree = new Problem5();
        tree.root = new Node5(9);
        tree.root.left = new Node5(7);
        tree.root.right = new Node5(5);
        tree.root.left.left = new Node5(2);
        tree.root.left.left.right = new Node5(3);

        findAverageLevel(root);
    }

    private static void findAverageLevel(Node5 node) {

        if (node == null){
            return;
        }

        Queue<Node5> queue=new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()){

           float sum=0;int count=0;
            Queue<Node5> temp=new LinkedList<>();

            while (!queue.isEmpty()){

                Node5 node5=queue.remove();
                sum+=node5.data;
                count++;
                if (node5.left!=null){
                    temp.add(node5.left);
                }
                if (node5.right!=null){
                    temp.add(node5.right);
                }

            }
            queue=temp;
            System.out.printf("%.2f",(sum/count));
            System.out.print(" ");


        }



    }
}
class Node5 {
    int data;
    Node5 left, right;
    Node5(int data) {
        this.data = data;
        left = right = null;
    }
}