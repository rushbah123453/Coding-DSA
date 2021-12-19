package dsa.graph.implementation.cycleDetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

private String name;
private List<Vertex> neighbours;
private boolean isVisited;
private boolean beingVisited;

public Vertex(String name){
    this.name=name;
    this.neighbours=new ArrayList<>();
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    public void addNeighbours(Vertex vertex) {
        this.neighbours.add(vertex);
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    @Override
    public String toString() {
        return "Vertex = "+this.name;
    }
}
