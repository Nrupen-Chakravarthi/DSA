package Recursion.Strings;

public class CountConsonants {
    public static void main(String[] args) {
        System.out.println(Count("Nrupen"));
    }
    static int Count(String str){
        if(str.isEmpty()){
            return 0;
        }
        char ch = str.charAt(0);
        int count = (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') ? 1 : 0;
        return count + Count(str.substring(1));
    }
}
