package dsa.graph.implementation.topologicalOrder;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    public Vertex(String name){
        this.name=name;
        this.neighbours=new ArrayList<>();
    }

    private String name;
    private List<Vertex> neighbours;
    private boolean isVisited;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(Vertex vertex) {
        this.neighbours.add(vertex);
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    @Override
    public String toString() {
        return "Vertex = "+this.name;
    }
}
