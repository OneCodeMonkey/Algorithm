// AC: Runtime: 28 ms, faster than 29.38% of Java online submissions for Coin Change.
// Memory Usage: 42.1 MB, less than 10.35% of Java online submissions for Coin Change.
// DP. see the annotations.
// T:O(n * k), S:O(n),  k is the number of coins' denomination
//
class Solution {
    public int coinChange(int[] coins, int amount) {
        // means to change i-money, we need at least dp[i] coins.
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int minCoin = Integer.MAX_VALUE;
            // if dp[i] has solution, then among dp[i - coin] (coin in coins[]) there must be one that is larger than zero, or i - coin == 0, then dp[i - coin] = 1.
            for (int coin: coins) {
                if (i >= coin) {
                    if (i == coin) {
                        minCoin = Math.min(minCoin, 1);
                    } else {
                        if (dp[i - coin] != 0) {
                            minCoin = Math.min(minCoin, dp[i - coin] + 1);
                        }
                    }
                }
            }
            // has solution
            if (minCoin != Integer.MAX_VALUE) {
                dp[i] = minCoin;
            }
        }

        return amount == 0 ? 0 : (dp[amount] == 0 ? -1 : dp[amount]);
    }
}