package dsa.graph.implementation.shortestPathAlgo.dijkstraAlgo;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {

    public static void main(String[] args) {
        Vertex vertex0=new Vertex("A");
        Vertex vertex1=new Vertex("B");
        Vertex vertex2=new Vertex("C");
        Vertex vertex3=new Vertex("D");
        Vertex vertex4=new Vertex("E");
        Vertex vertex5=new Vertex("F");
        Vertex vertex6=new Vertex("G");
        Vertex vertex7=new Vertex("H");

        vertex0.addNeighbours(new Edge(5.0,vertex0,vertex1));
        vertex0.addNeighbours(new Edge(8.0,vertex0,vertex7));
        vertex0.addNeighbours(new Edge(9.0,vertex0,vertex4));

        vertex1.addNeighbours(new Edge(15.0,vertex1,vertex3));
        vertex1.addNeighbours(new Edge(12.0,vertex1,vertex2));
        vertex1.addNeighbours(new Edge(4.0,vertex1,vertex7));

        vertex2.addNeighbours(new Edge(3.0,vertex2,vertex3));
        vertex2.addNeighbours(new Edge(11.0,vertex2,vertex6));

        vertex3.addNeighbours(new Edge(9.0,vertex3,vertex6));

        vertex4.addNeighbours(new Edge(5.0,vertex4,vertex7));
        vertex4.addNeighbours(new Edge(4.0,vertex4,vertex5));
        vertex4.addNeighbours(new Edge(20.0,vertex4,vertex6));

        vertex5.addNeighbours(new Edge(1.0,vertex5,vertex2));
        vertex5.addNeighbours(new Edge(13.0,vertex5,vertex6));

        vertex7.addNeighbours(new Edge(7.0,vertex7,vertex2));
        vertex7.addNeighbours(new Edge(6.0,vertex7,vertex5));

        List<Vertex> vertices=new ArrayList<>();
        vertices.add(vertex0);
        vertices.add(vertex1);
        vertices.add(vertex2);
        vertices.add(vertex3);
        vertices.add(vertex4);
        vertices.add(vertex5);
        vertices.add(vertex6);
        vertices.add(vertex7);

        DijkstraAlgo dijkstraAlgo=new DijkstraAlgo();


            dijkstraAlgo.compute(vertex0);


            // distance from vertex 0 to vertex 3
        System.out.println(dijkstraAlgo.getShortestPath(vertex3));

    }
}
