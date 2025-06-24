package TwoPointer;
import java.util.Arrays;

public class MoveZeros {
        public static void main(String[] args) {
            int[] nums = {3, 0, 1, 0, 12, 0, 5}; // First element is non-zero

            moveZeroesTwoPointers(nums);

            System.out.println("After shifting zeros: " + Arrays.toString(nums));
        }

        public static void moveZeroesTwoPointers(int[] nums) {
            int left = 0; // Pointer for placing non-zero elements

            // Iterate with right pointer
            for (int right = 0; right < nums.length; right++) {
                if (nums[right] != 0) {
                    // Swap elements if right pointer finds a non-zero
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++; // Move left pointer forward
                }
            }
        }
    }

