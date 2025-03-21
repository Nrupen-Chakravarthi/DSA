package Recursion;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        sort(nums, 0, nums.length - 1, 0);
        for(int i : nums){
            System.out.println(i);
        }
    }
    public static void helper(int[] nums, int index, int ptr){
        int c = nums[index];
        nums[index] = nums[ptr];
        nums[ptr] = c;
    }
    public static void sort(int[] nums, int r, int c, int max) {
        if(c == 1){
            return;
        }
//        int max = 0;
        int ptr = c;
        if(r <= c){
            if(nums[r] > nums[max]){
                max = r;
                sort(nums, r + 1, c, max);
            }
            else {
                sort(nums, r + 1, c, max);
            }
        }
        if(r > c){
            helper(nums, max, ptr);
            sort(nums, 0, c - 1, max);
        }

    }
}
