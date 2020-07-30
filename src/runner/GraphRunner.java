package runner;

import graph.*;

/**
 *
 * @author Fahad Shahzad
 */
public class GraphRunner {

    public static void main(String[] args) {

        //______________graph using HashMaps
        Graph<String, String> g = new Graph<>();
        g.addEdge("A", "B", "Children");
        g.addEdge("A", "C", "Brother");

        g.addEdge("B", "C", "Aunty");
        System.out.println(g);
//        g.addUndirectedEdge("D", "E", "None");
//        System.out.println(g);
    }
}
