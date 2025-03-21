package Sorting;

import java.util.HashMap;
import java.util.Map;

public class MinimumSubString {
    public static void main(String[] args) {
        System.out.println(minWindow("bba", "ab"));
    }
    public static String minWindow(String s, String t){
        int windowStart = 0;
        int windowEnd = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int matched = 0;
        Map<Character, Integer> tmap = new HashMap<>();
        for(char ch : t.toCharArray()){
            tmap.put(ch, tmap.getOrDefault(ch, 0) + 1);
        }
        for(windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char currCharr = s.charAt(windowEnd);
            if(tmap.containsKey(currCharr)){
                tmap.put(currCharr, tmap.get(currCharr) - 1);
                if(tmap.get(currCharr) >= 0) {
                    matched += 1;
                }
            }
            while((matched == t.length())){
                if(minLength > (windowStart - windowEnd) + 1){minLength = windowEnd - windowStart + 1;
                    start = windowStart;
                }
                char leftChar = s.charAt(windowStart++);
                if(tmap.containsKey(leftChar)){
                    if(tmap.get(leftChar) == 0){
                        matched -= 1;
                    }
                    windowStart += 1;
                    tmap.put(leftChar, tmap.get(leftChar) + 1);
                }
            }
        }
         if(minLength > s.length()){
             return "";
         }
         return s.substring(start, start + minLength);
    }

}
