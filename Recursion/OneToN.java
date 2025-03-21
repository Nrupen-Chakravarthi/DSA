package Recursion;

public class OneToN {
    public static void main(String[] args) {
        print(6);
    }
    static void print(int num){
        if(num == 0){
            return;
        }
        print(num - 1);
        System.out.println(num);
    }
}
