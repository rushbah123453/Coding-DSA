package algorithms.Interview.imp;


import java.util.LinkedList;
import java.util.Queue;

public class TopView {

private void getTopView(Treenode root)
{
    int leftMin=Integer.MAX_VALUE;
    int rightMax=Integer.MIN_VALUE;
    Queue<Node> queue=new LinkedList<>();
    LinkedList<Integer> linkedList=new LinkedList<>();
    queue.add(new Node(root,0));

    while (!queue.isEmpty())
    {
        int size=queue.size();
        for (int i=0;i<size;i++)
        {
            Node temp=queue.poll();
            if(i==0){
                if(temp.coordinate<leftMin)
                {
                    linkedList.addFirst(temp.treenode.val);
                    leftMin=temp.coordinate;
                }
            }

            if (i!=0 && i==size-1){
                if(temp.coordinate>rightMax)
                {
                    linkedList.add(temp.treenode.val);
                    rightMax=temp.coordinate;
                }
            }

            if(temp.treenode.left!=null)
            {
                queue.add(new Node(temp.treenode.left,temp.treenode.coordinate-1));
            }

            if(temp.treenode.right!=null)
            {
                queue.add(new Node(temp.treenode.right,temp.treenode.coordinate+1));
            }


        }
    }


}


}
class Treenode{
    int val;
    Treenode left;
    Treenode right;
    int coordinate;
    public Treenode(int val,int coordinate)
    {
        this.coordinate=coordinate;
        this.val=val;
    }
}
class Node{
    Treenode treenode;
    int coordinate;
    public Node(Treenode treenode,int coordinate)
    {
        this.treenode=treenode;
        this.coordinate=coordinate;
    }
}