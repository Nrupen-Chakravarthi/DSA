package Recursion.Strings;

import java.util.Arrays;

public class SkipACharacter {
    public static void main(String[] args) {
        skip("bacaaccd", "");
    }
    public static void skip(String up, String p) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char i = up.charAt(0);
        if(i == 'a'){
            skip(up.substring(1), p);
        }
        else {
            skip(up.substring(1), p + i);
        }
    }
}
