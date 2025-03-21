    package Recursion.Maze;

    public class NQueens {
        public static void main(String[] args) {
            int n = 4;
            boolean[][] maze = new boolean[n][n];
            System.out.println(count(maze, 0));
        }
        static int count(boolean[][] board, int r) {
            if (r == board.length) {
                display(board);
                System.out.println();
                return 1;
            }
            int count = 0;
            //placing the queen
            for (int col = 0; col < board.length; col++) {
                if (isSafe(board, r, col)) {
                    board[r][col] = true;
                    count = count + count(board, r + 1);
                    board[r][col] = false;
                }
            }
            return count;
        }
        private static boolean isSafe(boolean[][] maze, int row, int col){
            //checking for vertical
            for(int i = row - 1; i >= 0; i--){
                if(maze[i][col]){
                    return false;
                }
            }
            //diagnol left
            int maxLeft = Math.min(row, col);
            for(int i = 1; i<=maxLeft; i++){
                if(maze[row-1][col-1]){
                    return false;
                }
            }

            int maxRight = Math.min(row, maze[0].length - col - 1);
            for(int i = 1; i<= maxRight; i++){
                if(maze[row-1][col+1]){
                    return false;
                }
            }
            return true;
        }
            private static void display ( boolean[][] board){
                for (boolean[] row : board) {
                    for (boolean element : row) {
                        if (element) {
                            System.out.print("Q ");
                        } else {
                            System.out.print("X ");
                        }
                    }
                    System.out.println();
                }
            }
    }
