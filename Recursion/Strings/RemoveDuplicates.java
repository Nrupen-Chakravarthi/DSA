package Recursion.Strings;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        remove("abbssc", new HashSet<>());

    }
    static void remove(String str, HashSet<Character> seen){
        helper(str,seen);
        for(char ch : seen){
            System.out.println(ch);
        }
    }
    static void helper(String str, HashSet<Character> seen){
        if(str.isEmpty()){
            return;
        }
        char ch = str.charAt(0);
        if(seen.contains(ch)){
            helper(str.substring(1), seen);
        }
        seen.add(ch);
        helper(str.substring(1), seen);
    }
}
