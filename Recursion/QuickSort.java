package Recursion;

public class QuickSort {
    public static void main(String[] args) {
    int[] nums = {5,4,3,2,1};
    sort(nums, 0, nums.length - 1);
    for(int i : nums){
        System.out.println(i);
    }
    }
    public static void sort(int[] nums, int low, int hi){
        if(low >= hi){
            return;
        }
        int start = low;
        int end = hi;
        int val = low + (hi - low ) / 2;
        int pivot = nums[val];
        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }

//            if (start <= end) {
                int c = nums[start];
                nums[start] = nums[end];
                nums[end] = c;
                start++;
                end--;
//            }
        }
        sort(nums, low, end);
        sort(nums, start, hi);
    }
}
