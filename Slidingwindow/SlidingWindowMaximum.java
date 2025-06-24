package Slidingwindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        int ri = 0;

        for (int i = 0; i < n; i++) {
            // Remove element from front if it's no longer in the current window
            if (i >= k && deque.peekFirst() == nums[i - k]) {
                deque.pollFirst();
            }

            // Remove all elements smaller than current from the back
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.pollLast();
            }

            // Add current value to deque
            deque.offerLast(nums[i]);

            // Store result after the first full window is processed
            if (i >= k - 1) {
                result[ri++] = deque.peekFirst();
            }
        }

        return result;
    }
}
