package Recursion.Maze;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(countWays(3,3));
        printPaths("",3,3);
    }
    static int countWays(int r, int c){
        if(r == 1 || c == 1){

            return 1;
        }
//        int count = 0;
        int left = countWays(r-1, c);
        int right = countWays(r, c- 1);
        return left + right;
    }
    static void printPaths(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            printPaths(p + 'R', r - 1, c );
        }
        if(c > 1){
            printPaths(p + 'D', r, c - 1);
        }
    }
}
