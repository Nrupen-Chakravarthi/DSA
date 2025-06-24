package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = { 5,3,4,1,2};
//        System.out.println(Arrays.toString(mergeSort(nums)));
        mergeSortInPlace(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }
    static int[] mergeSort(int[] nums){
        if(nums.length == 1){
            return nums;
        }
        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }
    static int[] merge(int[] left, int[] right){
        int[] newArr = new int[left.length + right.length];
        int i = 0,j=0,k=0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                newArr[k++] = left[i++];
            }
            else {
                newArr[k++] = right[j++];
            }
        }
        while (i < left.length){
            newArr[k++] = left[i++];
        }
        while (j < right.length){
            newArr[k++] = right[j++];
        }
        return newArr;
    }

    static void mergeSortInPlace(int[] nums, int s, int e){
        if(s == e){
            return;
        }
        int mid = s + (e - s) / 2;

        mergeSortInPlace(nums, s, mid);
        mergeSortInPlace(nums, mid + 1, e);

        mergeInPlace(nums, s, mid, e);
    }
    static void mergeInPlace(int[] nums, int s, int mid, int e){
        int[] mix = new int[e- s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;

        while( i <= mid && j <= e){
            if(nums[i] < nums[j]){
                mix[k++] = nums[i++];
            }
            else {
                mix[k++] = nums[j++];
            }
        }
        while (i <= mid){
            mix[k++] = nums[i++];
        }
        while (j <= e){
            mix[k++] = nums[j++];
        }
        System.arraycopy(mix, 0, nums, s + 0, mix.length);
    }
}
