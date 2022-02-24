package dsa.graph.implementation.shortestPathAlgo.dijkstraAlgo;

public class Edge {

    private Double weight;
    private Vertex startVertex;
    private Vertex endVertex;

    public Edge(Double weight, Vertex startVertex, Vertex endVertex){
        this.weight=weight;
        this.startVertex=startVertex;
        this.endVertex=endVertex;
    }

    public Double getWeight() {
        return weight;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public Vertex getEndVertex() {
        return endVertex;
    }
}
