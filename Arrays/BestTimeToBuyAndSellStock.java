package Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {2,4,1};
        System.out.println(kadanes_Profit(prices));
    }
    //Brute force approach
    public static int maxProfit(int[] prices) {
        int min_indx = 0;
        int max_indx = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < prices[min_indx]){
                min_indx = i;
            }
        }
        max_indx = min_indx + 1;
        if(min_indx == (prices.length - 1)){
            return 0;
        }
        for(int j = min_indx + 1; j < prices.length; j++){

            if(prices[j] > prices[max_indx]){
                max_indx = j;
            }
        }
        return prices[max_indx] - prices[min_indx];
    }


    //Kadanes algo
    public static int kadanes_Profit(int[] nums){
        int buy_price = nums[0];
        int current_profit = 0;
        int max_profit = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < buy_price){
                buy_price = nums[i];
            }
            else{
                current_profit = nums[i] - buy_price;
                max_profit = Math.max(current_profit, max_profit);
            }
        }
        return max_profit;
    }
}
