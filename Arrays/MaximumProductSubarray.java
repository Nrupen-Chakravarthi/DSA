package Arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        MaximumProductSubarray obj = new MaximumProductSubarray();
        int[] nums=  {2,3,-2, 4};
        System.out.println(obj.maxProduct(nums));
    }
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int prod = 1;
            for(int j = i; j < nums.length; j++){
               prod *= nums[j];
                max = Math.max(max, prod);
            }

        }
        return max;
    }
}
