package Arrays;

import java.util.HashMap;

public class LongestConsecutieSubArray {
    public static void main(String[] args) {
        int[] nums = {2,6,1,9,4,5,3};
        System.out.println(getMaxLength1(nums));
    }
    //Brute Force approach
    public static int getMaxLength(int[] nums){
        int max_len = 0;
        for(int i : nums){
            int num = i;
            int j = 0;
            int count = 1;
            while (j < nums.length){
                if(num + 1 == nums[j]){
                    count += 1;
                    num = nums[j];
                    j = 0;
                }
                else {
                    j++;
                }
            }
            max_len = Math.max(max_len, count);
        }
        return max_len;
    }

    //Optimal Solution
    public static int getMaxLength1(int[] nums){
        HashMap<Integer, Boolean> ans = new HashMap<>();
        for(int i : nums){
            ans.put(i, false);
        }
        int max_len = 0;
        for(int i : nums){
            if(ans.get(i)){
                continue;
            }
            int curr_len = 1;
            ans.put(i, true);
            int nextNum = i + 1;
            while(ans.containsKey(nextNum) && !ans.get(nextNum)){
                curr_len += 1;
                ans.put(nextNum, true);
                nextNum += 1;
            }
            nextNum = i - 1;
            while (ans.containsKey(nextNum) && !ans.get(nextNum)){
                curr_len += 1;
                ans.put(nextNum, true);
                nextNum -= 1;
            }
            max_len = Math.max(max_len, curr_len);
        }
        return max_len;
    }
}
