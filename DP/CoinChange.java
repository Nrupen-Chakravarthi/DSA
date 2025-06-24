package DP;

public class CoinChange {
    public int coinChange(int[] coins, int amount){
        int[] dp = new int[amount + 1];
        if(amount < 1){
            return 0;
        }
        for(int i = 1; i <= amount; i++){
            dp[i] = Integer.MAX_VALUE;

            for(int coin : coins){
                if(coin <= i && dp[i - coin] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        return dp[amount];
    }
}
