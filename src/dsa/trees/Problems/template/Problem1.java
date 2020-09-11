package dsa.trees.Problems.template;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem1 {

    static TreeNode root;

    public static void main(String[] args) {
        Problem1 tree = new Problem1();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();

        }
        TreeNode node = sortedArrayToBST(nums);
        levelOrderTraversal(node);

    }


    public static TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) {
            return null;
        }
        TreeNode head = helper(num, 0, num.length - 1);
        return head;
    }


    public static TreeNode helper(int[] num, int low, int high) {
        if (low > high) { // Done
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, low, mid - 1);
        node.right = helper(num, mid + 1, high);
        return node;
    }


    private static void levelOrderTraversal(TreeNode node) {
        if (node == null)
            return;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.remove();
            System.out.print(node1.val + " ");
            if (node1.left != null) {
                queue.add(node1.left);
            }
            if (node1.right != null) {
                queue.add(node1.right);
            }
        }

    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

