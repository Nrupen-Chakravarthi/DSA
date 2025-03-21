package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] nums, int low, int high){
        if(low>=high){
            return;
        }

        int mid = low + (high - low ) / 2;
        int pivot = nums[mid];
        int s = low;
        int e = high;
        while (s<=e){
            while (nums[s] < pivot){
                s++;
            }
            while (nums[e] > pivot){
                e--;
            }
            if(s<=e) {
                swap(s, e, nums);
                s++;
                e--;
            }
        }
        sort(nums, low, e);
        sort(nums, s, high);
    }
    public  static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
