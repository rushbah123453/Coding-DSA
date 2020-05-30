package contest.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/n-ary-tree-postorder-traversal/submissions/
public class Problem590 {

    class Solution {
        List<Integer> list=new ArrayList<>();
        public List<Integer> postorder(Node root) {
            if(root==null)
                return list;

            for(Node node:root.children){
                postorder(node);
            }

            list.add(root.val);

            return list;
        }
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}