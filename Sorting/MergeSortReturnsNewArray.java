package Sorting;

import java.util.Arrays;

public class MergeSortReturnsNewArray {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergesort(nums)));
        System.out.println(1/2);
    }
    public static int[] mergesort(int[] nums){
        if(nums.length == 1){
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(nums, mid, nums.length));

         return merge(left, right);
    }
    public static int[] merge(int[] left, int[] right){
        int[] newArr = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

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
}
