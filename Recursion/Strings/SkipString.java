package Recursion.Strings;

public class SkipString {
    public static void main(String[] args) {
        skip("", "NrupenappHello");
//        "NrupenappHello"

    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        if(up.startsWith("apple")){
            skip(p, up.substring(5));
        }
        if(up.startsWith("app")){
            skip(p, up.substring(3));
        }
        else {            skip(p + up.charAt(0), up.substring(1));
        }
    }
}
