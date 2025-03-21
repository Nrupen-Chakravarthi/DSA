package Recursion.Strings;

public class Reverse {
    public static void main(String[] args) {
        reverse("", "hello");
    }
    static void reverse(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        reverse(ch+p, up.substring(1));

    }
}
