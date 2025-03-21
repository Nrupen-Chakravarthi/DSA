package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        print(num - 1);
    }
}
