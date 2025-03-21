package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TrappingWater {
    public static void main(String[] args) {
        int[] nums = {2,0,4,0,3,2,0,5,2,1,3};
        System.out.println(getWaterStored(nums));
        ArrayList<Integer> ans = new ArrayList<>();
    }
    public static int[] getLeftMaxi(int[] nums){
        int max = nums[0];
        int[] left = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                left[i] = max;
            }
            else {
                left[i] = max;
            }
        }
        return left;
    }
    public static int[] getRightMaxi(int[] nums){
        int max = nums[nums.length - 1];
        int[] right = new int[nums.length];
        for(int i = nums.length - 1; i >= 0;  i--){
            if(nums[i] > max){
                max = nums[i];
                right[i] = max;
            }
            else {
                right[i] = max;
            }
        }
        return right;
    }
    public static int getWaterStored(int[] nums){
        int[] left = getLeftMaxi(nums);
        int[] right = getRightMaxi(nums);
        int sum = 0;
        for(int i = 0;i < nums.length; i++){
            sum = sum + (Math.min(left[i], right[i]) - nums[i]);
        }
        return sum;
    }
}
