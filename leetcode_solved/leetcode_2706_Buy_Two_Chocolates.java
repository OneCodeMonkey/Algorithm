// AC: Runtime 2 ms Beats 100% 
// Memory 43.6 MB Beats 33.33%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int buyChoco(int[] prices, int money) {
        int ret = 0, curMinSum = Integer.MAX_VALUE, curMin = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] + curMin <= money) {
                curMinSum = Math.min(curMinSum, prices[i] + curMin);
            }
            curMin = Math.min(curMin, prices[i]);
        }
        return curMinSum == Integer.MAX_VALUE ? money : (money - curMinSum);
    }
}
