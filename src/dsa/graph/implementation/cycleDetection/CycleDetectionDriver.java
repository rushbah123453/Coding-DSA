package dsa.graph.implementation.cycleDetection;

import java.util.ArrayList;
import java.util.List;

public class CycleDetectionDriver {

    public static void main(String[] args) {
        Vertex a=new Vertex("A");
        Vertex b=new Vertex("B");
        Vertex c=new Vertex("C");
        Vertex d =new Vertex("D");
        Vertex e=new Vertex("E");
        Vertex f=new Vertex("F");

        List<Vertex> graph=new ArrayList<>();
        graph.add(a);
        graph.add(b);
        graph.add(c);
        graph.add(d);
        graph.add(e);

        a.addNeighbours(c);
        a.addNeighbours(e);

        c.addNeighbours(b);
        c.addNeighbours(d);

        e.addNeighbours(f);

        f.addNeighbours(a);

        CycleDetection cycleDetection=new CycleDetection();
        cycleDetection.cycleDetection(graph);

    }


}


