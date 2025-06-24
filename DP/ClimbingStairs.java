package DP;

public class ClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairs obj = new ClimbingStairs();
        System.out.println(obj.climbStairs(8));
    }
    public int climbStairs(int n){
        int[] stairs = new int[n+1];

        stairs[1] = 1;
        stairs[2] = 2;

        for(int i = 3; i <= 8; i++){
            stairs[i] = stairs[i - 1] + stairs[i - 2];
        }
        return stairs[n];
    }
}
