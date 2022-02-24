package dsa.graph.implementation.dfs;

import java.util.List;

public class DepthFirstSearch {

    public void dfs(List<Vertex> vertexList){

        for (Vertex vertex:vertexList){
            if(!vertex.isVisited()){
                vertex.setVisited(true);
                dfhelper(vertex);
            }
        }

    }

    private void dfhelper(Vertex vertex) {
        System.out.println(vertex);

        for (Vertex node:vertex.getAdjacaencyList()){
            if (!node.isVisited()){
                node.setVisited(true);
                dfhelper(node);
            }
        }
    }

}
