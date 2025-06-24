package Slidingwindow;

import ExceptionHandling.Main;

public class MaximumAverageSubarray {
    public static double getMaximumSubArray(int[] nums, int k){
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        int startIndex = 0;
        int end = k;
        while (end < nums.length){
            sum = sum - nums[startIndex++];
            sum = sum + nums[end++];

            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}
