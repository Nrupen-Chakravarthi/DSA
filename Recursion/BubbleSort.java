package Recursion;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        sort(nums, 0, nums.length - 1);
        for(int i : nums){
            System.out.println(i);
        }
    }

    public static void helper(int[] nums, int ptr){
        int c = nums[ptr];
        nums[ptr] = nums[ptr+1];
        nums[ptr + 1] = c;
    }
    public static void sort(int[] nums, int r, int c){
        if(c == 0){
            return;
        }
        if(r < c){
            if(nums[r] > nums[r+1]){
                helper(nums, r);
                sort(nums, r + 1, c);
            }
            else {
                sort(nums, r+1, c);
            }
        }
        else {
            sort(nums, 0, c - 1);
        }
    }
}
