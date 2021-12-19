package dsa.graph.implementation.shortestPathAlgo.dijkstraAlgo;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{

    private String name;
    private boolean isVisited;
    private double minDistance;
    private List<Edge> neighbours;
    private Vertex predecessor;


    public Vertex(String name){
        this.name=name;
        this.neighbours=new ArrayList<>();
        this.minDistance=Double.MAX_VALUE;
    }



    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }


    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    public List<Edge> getNeighbours() {
        return neighbours;
    }

    public void addNeighbours(Edge neighbours) {
        this.neighbours.add(neighbours);
    }

    @Override
    public int compareTo(Vertex o) {
        return Double.compare(this.minDistance,o.minDistance);
    }

    @Override
    public String toString() {
        return this.getName() +" - "+this.getMinDistance();
    }
}
