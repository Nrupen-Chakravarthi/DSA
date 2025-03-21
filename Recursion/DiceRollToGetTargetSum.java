package Recursion;

public class DiceRollToGetTargetSum {
    public static void main(String[] args) {
        combo("",4);
    }
    static void combo(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i <= target; i++){
            combo(p + i, target - i);
        }
    }
}
