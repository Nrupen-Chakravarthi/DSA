package Recursion.Strings;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(check("madama"));
    }
    static boolean check(String str){
        if(str.length()<=1){
            return true;
        }
        if(str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        }
        return check(str.substring(1, str.length() - 1));
    }
}
