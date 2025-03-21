package Recursion;

public class productNto1 {
    public static void main(String[] args) {
        System.out.println(product(5));
    }
    static int product(int num){
        if(num == 1){
            return 1;
        }
        return num * product(num - 1);
    }
}
