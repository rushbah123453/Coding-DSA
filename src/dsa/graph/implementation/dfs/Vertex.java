package dsa.graph.implementation.dfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private List<Vertex> adjacaencyList;
    private boolean isVisited;

    public Vertex(String name){
        this.name=name;
        this.adjacaencyList=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vertex> getAdjacaencyList() {
        return adjacaencyList;
    }

    public void addNeigbour(Vertex vertex) {
        this.adjacaencyList.add(vertex);
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
