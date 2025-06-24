package ArraysStrings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static boolean validAnagram(String s, String k){
        char[] c1 = s.toCharArray();
        char[] c2 = k.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int ptr1 = 0;

        int ptr2 = 0;
        if(c1.length != c2.length){
            return false;
        }
        while (ptr1 < c1.length && ptr2 < c2.length){
            if(c1[ptr1++] != c2[ptr2++]){
                return false;
            }
        }
        return true;
    }
    public static boolean validAnagramUsingHashMap(String s, String t){
        Map<Character, Integer> s1 = new HashMap<>();
        Map<Character, Integer> t1 = new HashMap<>();
        for(char ch : s.toCharArray()){
            s1.put(ch, s1.getOrDefault(ch, 0) + 1);
        }
        for(char ch : t.toCharArray()){
            t1.put(ch, t1.getOrDefault(ch, 0) + 1);
        }
        return s1.equals(t1);
    }
}
