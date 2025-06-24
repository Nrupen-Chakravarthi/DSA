package Strings;

import Graphs.CountComponents;

public class CountPalindromes {
    public static void main(String[] args) {
        CountPalindromes obj = new CountPalindromes();
        System.out.println(obj.countSubstrings("abbac"));
    }
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            count += countPalindromes(s, i, i);
            count += countPalindromes(s, i, i+1);
        }
        return count;
    }
    public int countPalindromes(String s, int start, int end){
        int count = 0;
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
                count++;
                start--;
                end++;
        }
        return count;
    }
}
