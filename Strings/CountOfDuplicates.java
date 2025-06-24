package Strings;

import java.util.*;

public class CountOfDuplicates {
    public static void main(String[] args) {
        String str = "aabbacb";
        System.out.println(printDuplicates(str));
    }
    public static List<Character> printDuplicates(String str){
        char[] ch = str.toCharArray();
        List<Character> ans;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : ch){
            if(map.containsKey(c)){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        ans = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
