package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {3,1,2,6,0};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] nums){

        int maxIndx = nums.length - 1;
        while (maxIndx != 0){
            int max = 0;
            for(int i = 0; i <= maxIndx; i++){
                if(nums[i] > max){
                    max = i;
                }
            }
            swap(max, maxIndx, nums);
            maxIndx--;
        }
    }
    public  static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
