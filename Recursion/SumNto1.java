package Recursion;

import java.util.Enumeration;

public class SumNto1 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    static int sum(int num){
        if(num == 1){
            return 1;
        }
        return num + sum(num - 1);
    }
}
