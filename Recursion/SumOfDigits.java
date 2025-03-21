package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfNums(1342));
    }
    static int sumOfNums(int num){
        if(num == 0){
            return 0;
        }
        int rem = num % 10;
        int newNum = num / 10;
        return rem + sumOfNums(newNum);
    }
}
