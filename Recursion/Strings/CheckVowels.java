package Recursion.Strings;

public class CheckVowels {
    public static void main(String[] args) {
        System.out.println(count("Nrupen"));
    }
    static int count(String str){
        if(str.isEmpty()){
            return 0;
        }
        int count = 0;
        char ch = str.charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||  ch == 'u'){
            count = count + 1;
            return count + count(str.substring(1));
        }
        else {
            return  count + count(str.substring(1));
        }
    }
}
