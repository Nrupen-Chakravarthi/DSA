package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5,3,4,1,2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] nums){
        int i =0;
        while (i <= nums.length - 2){
            int j = i + 1;
            while (j > 0){
                if(nums[j] < nums[j-1]){
                    swap(j, j-1, nums);
                    j--;
                }
                else {
                    break;
                }
            }
            i++;
        }
    }
    public  static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
