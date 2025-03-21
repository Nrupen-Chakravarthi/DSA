package Arrays;

import static java.lang.Math.max;

public class MaximumOfSubArray {
    public static void main(String[] args) {
        int[] nums = {3,-4,5,4,-1,7,-8};
        System.out.println(STR."Maximum Subarray Sum: \{kadanesAlgorithm(nums)}");
    }

        public static int maxSubArray(int[] nums) {
            int maxSum = Integer.MIN_VALUE;  // Initialize to the smallest possible value

            // Iterate over all possible subarrays
            for (int i = 0; i < nums.length; i++) {
                int currentSum = 0;

                // For each subarray starting at index i, iterate through the rest of the elements
                for (int j = i; j < nums.length; j++) {
                    currentSum += nums[j];  // Add the current element to the sum

                    // Update maxSum if we find a larger sum
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                }
            }

            return maxSum;
        }
        public static int kadanesAlgorithm(int[] nums){
        int maxSum = 0;
        int currSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            currSum = currSum + nums[i];
            maxSum = max(maxSum, currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
        }

    }
