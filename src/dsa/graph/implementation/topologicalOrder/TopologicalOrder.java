package dsa.graph.implementation.topologicalOrder;

import java.util.List;
import java.util.Stack;

//Topological Order only works with DAG- Directed Acyclic Graphs
public class TopologicalOrder {
    private Stack<Vertex> stack;

    public TopologicalOrder(){
        this.stack=new Stack<>();
    }

    public void dfs(Vertex vertex){
        vertex.setVisited(true);
        for (Vertex v:vertex.getNeighbours()){
            if (!v.isVisited()){

                dfs(v);
            }
        }
        stack.push(vertex);
    }

    public Stack<Vertex> getStack(){
        return this.stack;
    }

}
