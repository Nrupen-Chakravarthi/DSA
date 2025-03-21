package Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9,1,2,3};
        System.out.println(search(nums, 0, nums.length - 1, 2));
    }
    public static int search(int[] nums, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[start] <= nums[end]){
            if(target >= nums[start] && target <= nums[mid]){
                return search(nums, start, mid - 1, target);
            }
            else {
                return search(nums, mid + 1, end, target);
            }
        }
        if(nums[mid] <= target && target <= nums[end]){
            return search(nums, mid + 1, end, target);
        }

            return search(nums, start, mid - 1, target);
    }
}
