package Recursion;

public class PrintASCII {
    public static void main(String[] args) {
//        skip("abc");
        ascii("", "abc");
    }

    static void skip(String str){
        if(str.isEmpty()){
            return;
        }
        char ch = str.charAt(0);
        System.out.println(ch + " : " + (ch + 0));
        skip(str.substring(1));
    }
    static void ascii(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p +" : "+(p + 0));
            return;
        }
        char ch = up.charAt(0);
        ascii(p+ch, up.substring(1));
        ascii(p, up.substring(1));
    }
}
