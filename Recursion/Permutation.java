package Recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(permutations("","abc"));
    }
    static ArrayList<String> permutations(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
            for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutations(f + ch + s, up.substring(1)));
        }
            return ans;
    }
    static int permutationCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
           count = count +  permutationCount(f+ch+s, up.substring(1));
        }
        return count;
    }

    static void permut(String p, String up){
        if(up.isEmpty()){
            return;
        }

    }
}