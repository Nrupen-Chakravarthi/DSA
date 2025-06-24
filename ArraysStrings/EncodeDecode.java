package ArraysStrings;

import java.util.*;

public class EncodeDecode {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(Arrays.asList("nrupen", "chakri"));
        String ans = encode(strs);
        System.out.println(decode(ans));
    }
    public static String encode(List<String> strs) {
        StringBuilder str = new StringBuilder("");
        for(String s : strs){
            str.append(s);
            str.append("#");
        }
        return str.toString();
    }

    public static List<String> decode(String str){
        List<String> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder("");
        int ch = 0;
        while (ch < str.length()){
            if(str.charAt(ch) != '#'){
                builder.append(str.charAt(ch++));
            }
            else {
                list.add(builder.toString());
                builder = new StringBuilder("");
                ch++;
            }
        }
        return list;
    }
}
