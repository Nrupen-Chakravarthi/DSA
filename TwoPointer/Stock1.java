package TwoPointer;

public class Stock1 {
    public static int getProfit(int[] nums){
        int buy_price = nums[0];
        int max_profit = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < buy_price){
                buy_price = nums[i];
            }
            else {
                int curr_profit = nums[i] - buy_price;
                max_profit = Math.max(curr_profit, max_profit);
            }
        }
        return max_profit;
    }
}
