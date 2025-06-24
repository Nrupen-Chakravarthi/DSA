package TwoPointer;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums){
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                } else if (sum > 0) {
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
