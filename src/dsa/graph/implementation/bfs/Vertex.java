package dsa.graph.implementation.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Vertex {

   private String name;
   private boolean isVisited;
   private List<Vertex> adjacacencyList;

   public Vertex(String name){
       this.name=name;
       this.adjacacencyList=new ArrayList<>();
   }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public List<Vertex> getAdjacacencyList() {
        return adjacacencyList;
    }

    public void addNeigbour(Vertex vertex) {
        this.adjacacencyList.add(vertex);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
