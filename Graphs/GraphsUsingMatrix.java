package Graphs;

import java.util.Enumeration;

public class GraphsUsingMatrix {
    int[][] adjMatrix;
    int vertices;

    public GraphsUsingMatrix(int vertices){
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }
    public void addEdge(int src, int destination){
        adjMatrix[src][destination] = 1;
        adjMatrix[destination][src] = 1;
    }
    public void addVertex(){
        int[][] newMatrix = new int[vertices++][vertices++];
        for(int i = 0; i < adjMatrix.length; i++){
            for(int j = 0; j < adjMatrix[0].length; j++){
                newMatrix[i][j] = adjMatrix[i][j];
            }
        }
        adjMatrix = newMatrix;
        vertices++;
    }
    public void deleteVertex(int ver){
        int[][] newMatrix = new int[vertices--][vertices--];
        for(int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[0].length; j++) {
                if(i != ver && j != ver){
                    newMatrix[i][j] = adjMatrix[i][j];
                }
            }
        }
        adjMatrix = newMatrix;
        vertices--;
    }
    public void deleteEdge(int src, int des){
        adjMatrix[src][des] = 0;
        adjMatrix[des][src] = 0;
    }
}
