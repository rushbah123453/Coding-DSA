package dsa.graph.implementation.dfs;

import java.util.ArrayList;
import java.util.List;

public class DfsDriver {

    public static void main(String[] args) {
        DepthFirstSearch depthFirstSearch=new DepthFirstSearch();
        Vertex a=new Vertex("A");
        Vertex b=new Vertex("B");
        Vertex c=new Vertex("C");
        Vertex d =new Vertex("D");
        Vertex e=new Vertex("E");

        a.addNeigbour(b);
        b.addNeigbour(c);
        b.addNeigbour(d);
        d.addNeigbour(e);

        List<Vertex> list=new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        depthFirstSearch.dfs(list);
    }
}
