package algorithms.fundamentalAlgosImplementation;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class DFSandBFS {
    public static class Node {
        private int id;
        List<Node> adjacent = new LinkedList<>();

        private Node(int id) {
            this.id = id;
        }
    }
    private Node getNode(int id) {
        return new Node(id);
    }
    public void addEdge(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adjacent.add(d);
    }

    public boolean hasPathDFS(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        HashSet<Integer> hasVisited = new HashSet<>();
        return hasPathDFS(s, d, hasVisited);
    }
    public boolean hasPathDFS(Node source, Node dest, HashSet<Integer> hasVisited) {
        if(hasVisited.contains(source.id)) return false;
        hasVisited.add(source.id);
        if(source.id == dest.id) return true;
        for(Node child : source.adjacent) {
            hasPathDFS(child, dest, hasVisited);
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
