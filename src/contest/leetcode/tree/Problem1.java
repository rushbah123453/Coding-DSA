package contest.leetcode.tree;



import java.util.*;

//https://leetcode.com/problems/leaf-similar-trees/
public class Problem1 {

   static TreeNodes root;
    static TreeNodes root2;
    public static void main(String[] args) {
        Problem1 tree = new Problem1();
        tree.root = new TreeNodes(1);
        tree.root.left = new TreeNodes(5);
        tree.root.right = new TreeNodes(1);
        tree.root.left.left = new TreeNodes(6);
        tree.root.left.right = new TreeNodes(2);
        tree.root.left.right.left = new TreeNodes(7);
        tree.root.left.right.right = new TreeNodes(4);
        tree.root.right.left = new TreeNodes(9);
        tree.root.right.right = new TreeNodes(8);

        Problem1 tree2 = new Problem1();
        tree2.root2 = new TreeNodes(3);
        tree2.root2.left = new TreeNodes(5);
        tree2.root2.right = new TreeNodes(1);
        tree2.root2.left.left = new TreeNodes(6);
        tree2.root2.left.right = new TreeNodes(7);
        tree2.root2.right.left = new TreeNodes(4);
        tree2.root2.right.right = new TreeNodes(2);
        tree2.root2.right.right.left = new TreeNodes(9);
        tree2.root2.right.right.right = new TreeNodes(8);

        System.out.println( leafSimilar(tree.root,tree2.root2));

    }

    private static boolean leafSimilar(TreeNodes root1, TreeNodes root2) {

        List<Integer> leafNodeOfTree1=new ArrayList<>();
        List<Integer> leafNodeOfTree2=new ArrayList<>();
      List<Integer> list1=  findLeafNodes(root1,leafNodeOfTree1);
        List<Integer> list2=  findLeafNodes(root2,leafNodeOfTree2);


      return list1.equals(list2);
    }

    private static List<Integer> findLeafNodes(TreeNodes root1,List<Integer> leafNodes) {

      if (root1.left!=null)
      {
          findLeafNodes(root1.left,leafNodes);
      }
      if (root1.right!=null)
        {
            findLeafNodes(root1.right,leafNodes);
        }
        if (root1.left==null && root1.right==null)
        {
            leafNodes.add(root1.val);
        }

        return leafNodes;

    }


}

class TreeNodes {
    int val;
    TreeNodes left;
    TreeNodes right;

    TreeNodes(int val) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
