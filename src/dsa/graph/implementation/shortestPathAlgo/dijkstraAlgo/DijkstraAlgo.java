package dsa.graph.implementation.shortestPathAlgo.dijkstraAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgo {




    public void compute(Vertex vertices) {
        vertices.setMinDistance(0);
        PriorityQueue<Vertex> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(vertices);
        while (!priorityQueue.isEmpty())
        {
            Vertex vertex=priorityQueue.poll();
            for (Edge edge:vertex.getNeighbours()){
                Double startVertexWeigth=edge.getStartVertex().getMinDistance();
                Double targetVertexWeight= edge.getEndVertex().getMinDistance();
                Double edgeDistance= edge.getWeight();

                if (startVertexWeigth+edgeDistance<targetVertexWeight){
                    priorityQueue.remove(edge.getEndVertex());
                    edge.getEndVertex().setPredecessor(vertex);
                    edge.getEndVertex().setMinDistance(startVertexWeigth+edgeDistance);
                    priorityQueue.add(edge.getEndVertex());
                }
            }
        }
    }

    public List<Vertex> getShortestPath(Vertex targetVertex){
        List<Vertex> path = new ArrayList<>();
        for (Vertex vertex=targetVertex; vertex!=null;vertex=vertex.getPredecessor()){
            path.add(vertex);
        }
        Collections.reverse(path);
        return path;
    }
}
