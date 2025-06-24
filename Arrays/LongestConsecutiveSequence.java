package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {2,20,4,10,3,4,5};
        System.out.println(longestConsecutive(nums));
    }
    public  static int longestConsecutive(int[] nums){
        int minLen = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i : nums){
            map.put(i, false);
        }
        for(int i : nums){
            int currLen = 1;
            int nextNum = i + 1;
            while (map.containsKey(nextNum) && map.get(nextNum) == false){
                currLen++;
                map.put(nextNum, true);
                nextNum++;
            }
            int prevNum = i - 1;
            while (map.containsKey(prevNum) && map.get(prevNum) == false){
                currLen++;
                map.put(prevNum, true);
                prevNum--;
            }
            minLen = Math.max(currLen, minLen);
        }
        return minLen;
    }
}
