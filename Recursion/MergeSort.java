package Recursion;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {1,10,3,9,2,0};
        merge(nums, 0, nums.length - 1);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    public static void sort(int[] nums, int start, int mid, int end){
        int i = start;
        int j = mid + 1;
        int k = 0;
        int[] newArr = new int[end - start + 1];
        while (i <= mid && j <= end){
            if(nums[i] > nums[j]){
                newArr[k++] = nums[j++];
            }
            else {
                newArr[k++] = nums[i++];
            }
        }
        while (i <= mid){
            newArr[k++] = nums[i++];
        }
        while (j <= end){
            newArr[k++] = nums[j++];
        }
//        for (int l = 0; l < newArr.length; l++){
//            nums[start+l] = newArr[l];
//        }
        int l = 0;
        while( l < newArr.length){
            nums[start++] = newArr[l++];
        }
    }
    public static void merge(int[] nums, int start, int end){
        if(end - start == 0){
            return;
        }
        int mid = start + (end - start ) / 2;
        merge(nums, start, mid);
        merge(nums, mid + 1, end);
        sort(nums, start, mid, end);
    }
}
