package Recursion;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] nums = {2,1,5,6};
        System.out.println(check(nums, 0));
    }
    public static boolean check(int[] nums, int ptr){
        if(ptr == nums.length - 1){
            return true;
        }
        if(nums[ptr] > nums[ptr+1]){
            return false;
        }
        return check(nums, ptr + 1);
    }
}
