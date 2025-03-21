package Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
    public static void mergeSort(int[] nums, int start, int end){
        if(end - start == 0){
            return;
        }


        int mid = start + (end - start) / 2;
        mergeSort(nums, 0, mid);
        mergeSort(nums, mid + 1, end);

        merge(nums, start,mid, end);
    }
    public static void merge(int[] nums, int start,int mid,  int end){
        int[] mix = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end){
            if(nums[i] < nums[j]){
                mix[k++] = nums[i++];
            }
            else {
                mix[k++] = nums[j++];
            }
        }
        while(i <= mid){
            mix[k++] = nums[i++];
        }
        while (j <= end){
            mix[k++] = nums[j++];
        }
        System.arraycopy(mix, 0, nums, start + 0, mix.length);

    }
    public  static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
