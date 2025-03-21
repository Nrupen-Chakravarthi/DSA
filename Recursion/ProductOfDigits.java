package Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(ProductOfDigits(1342));
    }
    static int ProductOfDigits(int num){
        if(num%10 == num){
            return num;
        }
        int rem = num % 10;
        int newNum = num / 10;
        return rem * ProductOfDigits(newNum);
    }
}
