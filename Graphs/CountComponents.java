package Graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountComponents {
    public static void main(String[] args) {
        int[][] edges = {
                {0,1},
                {1,2},
                {2,3},
                {4,5}
        };
        CountComponents obj = new CountComponents();
        System.out.println(obj.countComponents(6, edges));
    }
    public int countComponents(int n, int[][] edges){
        int count = 0;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] pair : edges){
            adj.get(pair[0]).add(pair[1]);
            adj.get(pair[1]).add(pair[0]);
        }
        Set<Integer> visited = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(!visited.contains(i)) {
                getCountOfComponents(adj, visited, i, -1);
                count++;
            }
        }
//        return getCountOfComponents(adj, visited, count, node, prev);
        return count;
    }
    public void getCountOfComponents(List<List<Integer>> adj,Set<Integer> visited, int node, int prev){
        visited.add(node);
        for(int i : adj.get(node)){
            if(!visited.contains(i)){
                getCountOfComponents(adj, visited, i, node);
            }
        }
    }
}
