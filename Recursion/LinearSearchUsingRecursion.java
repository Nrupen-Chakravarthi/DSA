package Recursion;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] nums = {3,2,1,18,9};
        System.out.println(search(nums, 10, 0));

    }
    public static int search(int[] nums, int target, int start){
        if(start == nums.length){
            return -1;
        }
        if(nums[start] == target){
            return start;
        }
        return search(nums, target, start + 1);
    }
}
