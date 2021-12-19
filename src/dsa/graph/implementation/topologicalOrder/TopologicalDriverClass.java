package dsa.graph.implementation.topologicalOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalDriverClass {

    public static void main(String[] args) {
        TopologicalOrder order=new TopologicalOrder();

        Vertex _0=new Vertex("0");
        Vertex _1=new Vertex("1");
        Vertex _2=new Vertex("2");
        Vertex _3=new Vertex("3");
        Vertex _4=new Vertex("4");
        Vertex _5=new Vertex("5");

        _2.setNeighbours(_3);
        _3.setNeighbours(_1);
        _4.setNeighbours(_0);
        _4.setNeighbours(_1);
        _5.setNeighbours(_0);
        _5.setNeighbours(_2);

        List<Vertex> graph = new ArrayList<>();
        graph.add(_0);
        graph.add(_1);
        graph.add(_2);
        graph.add(_3);
        graph.add(_4);
        graph.add(_5);

        for (int i=0;i<graph.size();i++)
        {
           if(!graph.get(i).isVisited())
            order.dfs(graph.get(i));
        }

      Stack<Vertex> stack=  order.getStack();
       for (int i=0;i<graph.size();i++)
            System.out.println(stack.pop());


    }
}
