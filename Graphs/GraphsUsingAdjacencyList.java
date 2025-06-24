package Graphs;

import java.util.*;

public class GraphsUsingAdjacencyList {
    Map<Integer, List<Integer>> adjList;

    GraphsUsingAdjacencyList(){
        adjList = new HashMap<>();
    }
    public void addVertex(int vertex){
        adjList.put(vertex, new LinkedList<>());
    }
    public void addEdge(int src, int dest){
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }
    public void deleteVertex(int vertex){
        adjList.remove(vertex);
        for(List<Integer> edges : adjList.values()){
            edges.remove((Integer) vertex);
        }
    }
    public void deleteEsge(int src, int dest){
        adjList.get(src).remove((Integer) dest);
        adjList.get(dest).remove((Integer) src);

    }
    public void DFSIterative(int StartIndex){
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(StartIndex);
        while(!stack.isEmpty()){
            int top = stack.pop();
            visited.add(top);
            for(int n : adjList.get(top)){
                if(!visited.contains(n)){
                    stack.push(n);
                }
            }
        }
    }
    public void BFSIterative(int startIndex){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startIndex);
        visited.add(startIndex);
        while (!queue.isEmpty()){
            int top = queue.poll();
//            visited.add(top);
            for(int neighbour : adjList.getOrDefault(top, Collections.emptyList())){
                if(!visited.contains(neighbour)){
                    queue.add(neighbour);
                    visited.add(neighbour);
                }
            }
        }
    }
}
