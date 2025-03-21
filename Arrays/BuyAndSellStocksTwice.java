package Arrays;

public class BuyAndSellStocksTwice {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(getMaximumProfit(nums));
    }
    public static int getMaximumProfit(int[] nums){
        int max_profit = 0;
//        boolean buy = true;
//        boolean sell = true;
        int total_profit = 0;
        int max_index = Integer.MIN_VALUE;
        int buy_price = 0;
        for(int i = 0; i < nums.length; i++){
            if(buy_price == 0){
                buy_price = nums[i];
            }
            else if(nums[i] < buy_price){
                buy_price = nums[i];
            }
            else {
                int curr_profit = nums[i] - buy_price;
                max_profit = Math.max(max_profit, curr_profit);
                total_profit = max_profit + total_profit;
                max_profit = 0;
                buy_price = 0;
                curr_profit = 0;
            }
        }
        return total_profit;
    }
}
