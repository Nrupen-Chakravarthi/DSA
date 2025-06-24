package Graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphValidTree {
    public static void main(String[] args) {
        int[][] edges = {
                {0,1},
                {0,2},
                {0,3},
                {1,4}
        };
        List<Integer> ans=  new ArrayList<>();
    }
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] pair : edges){
            adj.get(pair[0]).add(pair[1]);
            adj.get(pair[1]).add(pair[0]);
        }
        Set<Integer> visited = new HashSet<>();
        int prev = -1;
        int node = 0;

        if(!checkValidTree(adj, visited, node, prev)){
            return false;
        }

        return visited.size() == n;

    }
    public boolean checkValidTree(List<List<Integer>> adj, Set<Integer> visited, int node, int prev){
        if(visited.contains(node)){
            return false;
        }
        visited.add(node);
        for(int i : adj.get(node)){
            if(i == prev){
                continue;
            }
            if(!checkValidTree(adj, visited, i,node)){
                return false;
            }
        }
        return true;
    }
}
