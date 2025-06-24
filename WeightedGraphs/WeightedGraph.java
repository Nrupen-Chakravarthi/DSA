package WeightedGraphs;

import java.lang.reflect.Array;
import java.util.*;

public class WeightedGraph {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(6);
        graph.addUndirectedEdge(0,1, 4);
        graph.addUndirectedEdge(0,2,4);
        graph.addUndirectedEdge(1,2,2);
        graph.addUndirectedEdge(1,3, 3);
        graph.addUndirectedEdge(1,4,1);
        graph.addUndirectedEdge(1,5,6);
        graph.addUndirectedEdge(3,5,2);
        graph.addUndirectedEdge(4,5,3);
        List<GraphEdge>[] result = graph.getVertices();
//        for(List<GraphEdge> i : result){
//            for(GraphEdge j : i){
//                System.out.print(STR."Source: \{j.getSource()} Destination: \{j.getDestination()} weight: \{j.getWeight()}");
//                System.out.println();
//            }
//        }
        System.out.println(Arrays.toString(graph.dijkstrasShortestPath(graph, 2)));

    }
    private int vertices;

    private List<GraphEdge>[] adjacencyList;

    public WeightedGraph(int vertices){
        this.vertices = vertices;
        adjacencyList = new ArrayList[vertices];

        for(int i = 0; i < vertices; i++){
            adjacencyList[i] = new ArrayList<>();
        }
    }

    public void addDirectedEdge(int source, int destination, int weight){
        GraphEdge edge = new GraphEdge(source, destination, weight);
        adjacencyList[source].add(edge);
    }
    public void addUndirectedEdge(int source, int destination, int weight){
        GraphEdge edge = new GraphEdge(source, destination, weight);
        GraphEdge edge1 = new GraphEdge(destination, source, weight);


        adjacencyList[source].add(edge);
        adjacencyList[destination].add(edge1);
    }
    public List<GraphEdge>[] getVertices(){
        return adjacencyList;
    }

    public int[] dijkstrasShortestPath(WeightedGraph graph, int source){
        int[] distance = new int[graph.getVertices().length];
        Arrays.fill(distance, Integer.MAX_VALUE);

        PriorityQueue<GraphEdge> queue = new PriorityQueue<>(Comparator.comparingInt(GraphEdge::getWeight));
        distance[source] = 0;

        queue.add(new GraphEdge(source, source, 0));

        while (!queue.isEmpty()){
            GraphEdge newEdge = queue.poll();
            int destination = newEdge.getDestination();

            for(GraphEdge edge : graph.getVertices()[destination]) {
                int newDistance = distance[destination] + edge.getWeight();

                if (newDistance < distance[edge.getDestination()]) {
                    distance[edge.getDestination()] = newDistance;
                    queue.add(new GraphEdge(edge.getSource(), edge.getDestination(), newDistance));
                }
            }
        }
        return distance;
    }
}
