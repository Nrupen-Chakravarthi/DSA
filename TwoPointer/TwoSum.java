package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSumUsingHashMap(nums, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        Arrays.sort(nums);


        while (start < end) {
            if (nums[start] + nums[end] == target) {
                int[] ans =   new int[]{nums[start], nums[end]};
            } else if (nums[start] + nums[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{-1, -1};
    }
    public static int[] twoSumUsingHashMap(int[] nums, int target){
        int start = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (start < nums.length ){
            int required = target - nums[start];
            if(map.containsKey(required)){
                return new int[]{map.get(required), start};
            }
            else {
                map.put(nums[start], start++);
            }
        }
        return new int[]{-1, -1};
    }
}
