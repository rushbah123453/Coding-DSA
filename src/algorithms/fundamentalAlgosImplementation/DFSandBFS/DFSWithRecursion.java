package algorithms.fundamentalAlgosImplementation.DFSandBFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class DFSWithRecursion {

}

class Graph {
    int noOfNodes;
    List<Node> adj;

    Graph(int noOfNodes) {
        this.noOfNodes = noOfNodes;
        this.adj = new LinkedList<>();
    }
}

class Node {
    int data;
    List<Node> neighbours;
}
