package algorithms.Interview.imp;// { Driver Code Starts
//Initial Template for Java


//Contributed by Sudarshan Sharma
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Nodes
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Nodes left, right; //left and right references

    // Constructor of tree node
    public Nodes(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}





//User function Template for Java


class BottomView
{
    //Function to return a list containing the bottom view of the given tree.
    static Map<Integer,Custom> map;
    public ArrayList <Integer> bottomView(Nodes root)
    {
        // Code here
        map=new TreeMap<>();
        helper(root,0,0);

        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Custom> node:map.entrySet())
        {
            list.add(node.getValue().val);
        }
        return list;

    }

    private void helper(Nodes root,int yCoordinate,int height)
    {
        if(root==null) return ;
        if(!map.containsKey(yCoordinate))
            map.put(yCoordinate,new Custom(root.data,height));
        else{
            Custom temp=map.get(yCoordinate);
            int ht=temp.height;
            if(ht<=height)
            {
                map.put(yCoordinate,new Custom(root.data,height));
            }
        }
        helper(root.left,yCoordinate-1,height+1);
        helper(root.right,yCoordinate+1,height+1);

    }
}

class Custom{
    int val;
    int height;
    public Custom(int val,int height)
    {
        this.val=val;
        this.height=height;
    }
}
