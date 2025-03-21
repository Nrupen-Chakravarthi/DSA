package Arrays;

public class ShiftNegativeToOneSide {
    public static void main(String[] args) {
        int[] nums = {1,2,3,-1,-2,-3};
        shift(nums);
        for (int i : nums){
            System.out.print(i + " ");
        }
    }
    public static void shift(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (mid <= end){
            if(nums[mid] > 0){
                swap(nums, mid, end);
                end--;
            }
            if(nums[mid] < 0){
                mid++;
                start++;
            }

        }
    }
    private static void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
