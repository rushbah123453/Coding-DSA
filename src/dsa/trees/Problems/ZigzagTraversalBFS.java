package dsa.trees.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ZigzagTraversalBFS {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> finalList=new ArrayList<>();

        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();

        if(root!=null) s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty()){
            List<Integer> list1=new ArrayList<>();
            while(!s1.isEmpty()){
                TreeNode temp=s1.pop();
                list1.add(temp.val);
                if(temp.left!=null)
                    s2.push(temp.left);
                if(temp.right!=null)
                    s2.push(temp.right);
            }
            if(list1.size()>0)
                finalList.add(list1);
            List<Integer> list2=new ArrayList<>();
            while(!s2.isEmpty()){
                TreeNode temp=s2.pop();
                list2.add(temp.val);
                if(temp.right!=null)
                    s1.push(temp.right);
                if(temp.left!=null)
                    s1.push(temp.left);

            }
            if(list2.size()>0)
                finalList.add(list2);

        }



        return finalList;

    }
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
