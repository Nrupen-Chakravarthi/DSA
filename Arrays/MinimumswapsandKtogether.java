package Arrays;

public class MinimumswapsandKtogether {
    public static void main(String[] args) {
        int[] nums = {2,1,5,6,3};
        int k = 3;
        System.out.println(getMinimumSwaps(nums, 3));
    }
    public static int getMinimumSwaps(int[] nums, int k){
        int NumsLessThanK = getCount(nums, k);
        int min_swaps = Integer.MAX_VALUE;

        for(int i= 0; i< nums.length; i++){
            int left = i;
            int right = left + NumsLessThanK - 1;
            if(right == nums.length - 1){
                int swaps = 0;
                while (left <= right) {
                    if (nums[left] <= k) {
                        left++;
                    } else {
                        swaps += 1;
                        left++;
                    }
                }
                min_swaps = Math.min(min_swaps, swaps);
                break;
            }
            int curr_swaps = 0;
            while(left<=right){

                if(nums[left] <= k){
                    left++;
                }
                else{
                    curr_swaps += 1;
                    left++;
                }
            }
            min_swaps = Math.min(min_swaps, curr_swaps);
        }
        return min_swaps;
    }
    public static int getCount(int[] nums, int k){
        int count = 0;
        for(int i : nums){
            if(i<= k){
                count += 1;
            }
        }
        return count;
    }
}
