package Recursion.Strings;

public class Capitalize {
    public static void main(String[] args) {
        System.out.println(split("hello world welcome to khammam"));
    }
    static String split(String str){
       if(str.isEmpty()){
           return "";
       }
       int count = str.indexOf(' ');
       if(count == -1){
           char c = str.charAt(0);
           return Character.toUpperCase(c) + str.substring(1);
       }
       String word = str.substring(0, count);
       String capitalizeWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
//        System.out.println(capitalizeWord);
        return capitalizeWord + " " +split(str.substring(count + 1, str.length()));
    }
}
