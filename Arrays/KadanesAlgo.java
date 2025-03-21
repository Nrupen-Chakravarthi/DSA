package Arrays;

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(getMaxSubArray(nums));
    }
    public static int getMaxSubArray(int[] nums){
        int sum = 0;
        int maxi = nums[0];
        for(int i = 0;i < nums.length; i++){
            sum = sum + nums[i];
            maxi = Math.max(sum, maxi);
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }
}
