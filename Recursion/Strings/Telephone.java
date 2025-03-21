package Recursion.Strings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Telephone {
    public static void main(String[] args) {
        ArrayList<String> ans;
        ans = pad("","12");
        System.out.println(Arrays.toString(ans.toArray()));

//        char ch = 'a';
//        System.out.println(ch + 1);
    }
        static ArrayList<String> pad(String p, String up){
            if(up.isEmpty()){
                ArrayList<String> ans = new ArrayList<>();
                ans.add(p);
                return ans;
            }
            ArrayList<String> finalAns = new ArrayList<>();
            int digit = up.charAt(0) - '0';
            for(int i = (digit - 1) * 3; i < digit * 3; i++){
                char ch = (char) ('a' + i);
                finalAns.addAll(pad(p + ch, up.substring(1)));
            }
            return finalAns;
        }
}
