package dsa.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class NumberOfConnectedComponents {
    public static int getNumberOfConnectedComponents(int n, int[][] edges) {
        int res = 0;
        boolean[] isVisited = new boolean[n];
        Map<Integer, LinkedList<Integer>> adj = new HashMap<>();
        for(int i = 0; i < n; i++) {
            adj.put(i, new LinkedList<>());
        }
        for(int i = 0; i < edges.length; i++) {
            //To take care of edge case when we have only one edge and no neighbours
            if(edges[i].length == 2) {
                adj.get(edges[i][0]).add(edges[i][1]);
                adj.get(edges[i][1]).add(edges[i][0]);
            }
        }
        for(int i = 0; i < n; i++) {
            if(!isVisited[i]) {
                dfs(n, adj, i, isVisited);
                res++;
            }
        }
        return res;
    }

    public static void dfs(int n, Map<Integer, LinkedList<Integer>> adj, int i, boolean[] isVisited) {
        if(i >= n || isVisited[i]) return;
        isVisited[i] = true;
        for(int neighbour : adj.get(i)) {
            dfs(n, adj, neighbour, isVisited);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {{0, 1}, {1, 2}, {3, 4}};
        int count = getNumberOfConnectedComponents(n, edges);
        System.out.println("1. Number of connected components: " + count);

        int n2 = 6;
        int[][] edges2 = {{0, 1}, {1, 2}, {3, 4}, {4, 5}, {5, 1}};
        int count2 = getNumberOfConnectedComponents(n2, edges2);
        System.out.println("2. Number of connected components: " + count2);

    }
}
