package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(3020103));
    }
    static int count = 0;
    public static int countZeroes(int num){
        if(num == 0){
            return count;
        }
        if(num % 10 == 0){
             count = count + 1;
        }
        return countZeroes(num / 10);
    }
}
