package dsa.graph.implementation.cycleDetection;

import java.util.List;

public class CycleDetection {

    public void cycleDetection(List<Vertex> vertex){
        for (Vertex v: vertex){
            if(!v.isVisited()){
                dfs(v);
            }
        }
    }

    private void dfs(Vertex v) {
        v.setBeingVisited(true);
        for (Vertex vertex:v.getNeighbours()){
            if(vertex.isBeingVisited()){
                System.out.println("Cycle Detected !!!");
                return;
            }

            if (!vertex.isVisited()){
                vertex.setVisited(true);
                dfs(vertex);
            }

        }

        v.setVisited(true);
        v.setBeingVisited(false);
    }


}
