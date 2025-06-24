package ArraysStrings;

import java.util.HashMap;
import java.util.Map;

public class LongestSequence {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        int maxLen = 0;
        for(int n : nums){
            map.put(n, false);
        }
        for(int num : nums){
            if(map.get(num)){
                continue;
            }
            map.put(num, true);
            int curr_len = 1;
            int nextNum = num + 1;
        while (map.containsKey(nextNum) && !map.get(nextNum)){
            map.put(nextNum, true);
            curr_len++;
            nextNum = nextNum + 1;

            }
        int prevNum = num - 1;
        while (map.containsKey(prevNum) && !map.get(prevNum)){
            map.put(prevNum, true);
            curr_len++;
            prevNum = prevNum - 1;
        }
        maxLen = Math.max(curr_len, maxLen);
        }
        return maxLen;
    }
}