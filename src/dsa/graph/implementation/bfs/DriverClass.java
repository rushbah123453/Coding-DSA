package dsa.graph.implementation.bfs;

public class DriverClass {
    public static void main(String[] args) {

        BreadthFirstSearch breadthFirstSearch=new BreadthFirstSearch();

        Vertex a=new Vertex("A");
        Vertex b=new Vertex("B");
        Vertex c=new Vertex("C");
        Vertex d=new Vertex("D");
        Vertex e=new Vertex("E");
        Vertex f=new Vertex("F");
        Vertex g=new Vertex("G");
        Vertex h=new Vertex("H");

        a.addNeigbour(b);
        a.addNeigbour(f);
        a.addNeigbour(g);

        b.addNeigbour(a);
        b.addNeigbour(c);
        b.addNeigbour(d);

        c.addNeigbour(b);
        d.addNeigbour(b);
        d.addNeigbour(e);

        f.addNeigbour(a);
        g.addNeigbour(a);
        g.addNeigbour(h);


        h.addNeigbour(g);

        breadthFirstSearch.traverse(a);
    }
}
