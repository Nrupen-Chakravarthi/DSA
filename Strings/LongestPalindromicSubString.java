package Strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        LongestPalindromicSubString obj = new LongestPalindromicSubString();
//        System.out.println(obj.longestPalindrome("abbac"));
        System.out.println(Integer.parseInt("10"));
    }
    public String longestPalindrome(String s){
        PriorityQueue<String> ans = new PriorityQueue<>((a,b) -> b.length() - a.length());
        for(int i = 0; i < s.length(); i++){
            countPalindromes(s,ans, i, i);
            countPalindromes(s,ans, i, i + 1);
        }
        return ans.poll();
    }
    public void countPalindromes(String s, PriorityQueue<String> ans, int start, int end){
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            ans.offer(s.substring(start, end + 1));
            start--;
            end++;
        }
    }


    ////Using DP
    //we create a 2d matrix for storing the result of previous.
    // we use 2d because we will use start and end for chceking
    public String usingDp(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int maxLen = 1;
        int start = 0;
        //for length one
        for(int i = 0; i < s.length(); i++){
            dp[i][i] = true;
        }
        //for length two
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                start = i;
                maxLen = 2;
            }
        }

        //for length greater than 2
        for(int len = 3; len <= n; len++){
            for(int i = 0; i <= n - len; i++){
                int j = i + len - 1;
                if(s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]){
                    dp[i][j] = true;
                    start = i;
                    maxLen = len;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }
}
