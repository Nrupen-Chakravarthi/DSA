package Recursion.Strings;

public class StringLength {
    public static void main(String[] args) {
        System.out.println(Count("Nrupen "));
    }
    static int Count(String str){
        if(str.isEmpty()){
            return  0;
        }
        if(str.charAt(0) == ' '){
            return Count(str.substring(1));
        }
        return 1 + Count(str.substring(1));
    }
}
