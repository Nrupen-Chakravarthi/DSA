package Slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumSubString {
    public static String minWindow(String s, String k){
        int windowStart = 0;
        int windowEnd = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int matched = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : k.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char c = s.charAt(windowEnd);
            if(map.containsKey(c)){
                map.put(c, map.get(c) - 1);
                if(map.get(c) >= 0){
                    matched++;
                }
            }
            while (matched == k.length()){
                if(minLen > (windowEnd - windowStart + 1)){
                    minLen = windowEnd - windowStart + 1;
                    start = windowStart;
                }
                char leftChar = s.charAt(windowStart++);
                if(map.containsKey(leftChar) && map.get(leftChar) == 0){

                    matched--;
                }
                map.put(leftChar, map.get(leftChar) + 1);
            }
        }
        if(minLen > s.length()){
            return "";
        }
        return s.substring(start, start + minLen + 1);
    }
}
