package dsa.graph.implementation.undirectedgraph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {

    public static void main(String[] args) {

        //vertices
        int v=5;

        //Graph with 5 nodes/vertices
        List<List<Integer>> adjacencyList=new ArrayList<>();

        //initialise 5 list
        for (int i=0;i<5;i++)
            adjacencyList.add(new ArrayList<>());

        addEdge(adjacencyList,0,1);
        addEdge(adjacencyList,0,4);
        addEdge(adjacencyList,1,4);
        addEdge(adjacencyList,1,2);
        addEdge(adjacencyList,1,3);


printGraph(adjacencyList);
    }

    private static void addEdge(List<List<Integer>> adjacencyList, int u, int v) {

        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);

    }

    static void printGraph(List<List<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex" + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }


}
