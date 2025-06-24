package Slidingwindow;
import java.util.*;
public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidbaooo"));
    }
    public static boolean isFreqSame(int[] freq, int[] windowFreq){
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != windowFreq[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {
       int[] freq = new int[26];
       for(int i = 0; i < s1.length(); i++){
           freq[s1.charAt(i) - 'a']++;
       }
       int windowSize = s1.length();
        for(int i = 0; i < s2.length(); i++){
            int[] windowFreq = new int[26];
            int windowIndx = 0;
            int indx = i;
            while (windowIndx < windowSize && indx < s2.length()){
                windowFreq[s2.charAt(indx) - 'a']++;
                windowIndx++;
                indx++;
            }
            if(isFreqSame(freq, windowFreq)){
                return true;
            }
        }
        return false;
    }
}
