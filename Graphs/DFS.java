package Graphs;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS {
    public void DFSIterative(int StartVertex){
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(StartVertex);
        while (!stack.isEmpty()){
            int top = stack.pop();
            if(!visited.contains(top)){
                visited.add(top);
            }
        }
    }
}
