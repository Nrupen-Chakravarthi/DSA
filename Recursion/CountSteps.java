package Recursion;

public class CountSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(9));
    }
    public static int numberOfSteps(int num){
        return count(num, 0);
    }

    public static int count(int num, int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){

           return count(num / 2, steps + 1);
        }

           return count(num - 1, steps + 1);

    }
}
