package dsa.graph.implementation.bfs;


import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public void traverse(Vertex vertex){
        Queue<Vertex> queue=new LinkedList<>();
        queue.add(vertex);
        vertex.setVisited(true);

        while (!queue.isEmpty()){
            Vertex root=queue.poll();
            System.out.println(root);
            for (Vertex node: root.getAdjacacencyList()){

            if(!node.isVisited()){
                node.setVisited(true);

                queue.add(node);
            }

            }
        }
    }
}
