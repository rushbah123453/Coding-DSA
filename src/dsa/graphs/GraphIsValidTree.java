//package dsa.graphs;
//
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Map;
//
////Check if graph is a valid tree
////An undirected graph is tree if it has following properties.
////        1) There is no cycle.
////        2) The graph is connected.
//public class GraphIsValidTree {
//    public static boolean isTree(int n, int[][] edges) {
//        Map<Integer, LinkedList<Integer>> adj = new HashMap<>();
//        for(int i = 0; i < n; i++) {
//            adj.put(i, new LinkedList<Integer>());
//        }
//        for(int i = 0; i < edges.length; i++) {
//            adj.get(edges[i][0]).add(edges[i][1]);
//            adj.get(edges[i][1]).add(edges[i][0]);
//        }
//        boolean[] visited = new boolean[n];
//        for(int i = 0; i < n; i++) {
//
//
//        }
//
//    }
//    public static void main(String[] args) {
//
//    }
//}
