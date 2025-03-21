package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNum(1342));
    }

    //Method1
   static int revNum;
    static int reverseNum(int num){
        if(num % 10 == num){
           return addNum(1);

        }
        int rem = (num % 10);
        addNum(rem);
        return reverseNum(num / 10);
    }
    static int addNum(int n){
        revNum = (revNum * 10) + n;
        return revNum;
    }





}
