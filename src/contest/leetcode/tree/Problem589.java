package contest.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/n-ary-tree-preorder-traversal/submissions/
public class Problem589 {

    List<Integer> list=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null)
            return list;

        list.add(root.val);

        for(Node node:root.children){
            preorder(node);
        }

        return list;


    }
}
