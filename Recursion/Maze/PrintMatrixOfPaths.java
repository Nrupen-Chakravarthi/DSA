package Recursion.Maze;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintMatrixOfPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true,true},
                {true, true,true},
                {true, true,true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        printMatrix("",maze, 0,0,path, 1);
    }
    static void printMatrix(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for(int[] i : path){
                System.out.println(Arrays.toString(i));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length - 1){
            printMatrix(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if(c < maze[0].length - 1){
            printMatrix(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if(r > 0){
            printMatrix(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if(c > 0){
            printMatrix(p + 'L', maze, r, c - 1, path, step + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
