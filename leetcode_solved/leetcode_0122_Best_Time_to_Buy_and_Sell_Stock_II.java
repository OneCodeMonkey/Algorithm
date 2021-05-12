// AC:
// Runtime: 1 ms, faster than 64.85% of Java online submissions for Best Time to Buy and Sell Stock II.
// Memory Usage: 38.4 MB, less than 87.22% of Java online submissions for Best Time to Buy and Sell Stock II.
// 思路：贪心
// T:O(n), S:O(1)
//
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int tempMin = -1;
        int maxProfix = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (tempMin == -1) {
                // 买入点
                if (prices[i] < prices[i + 1]) {
                    // 已是最后一天，直接卖
                    if (i + 1 == prices.length - 1) {
                        maxProfix += prices[i + 1] - prices[i];
                        return maxProfix;
                    }
                    tempMin = prices[i];
                }
            } else {
                // 最后一天，不得不卖
                if (prices[i] <= prices[i + 1] && i + 1 == prices.length - 1) {
                    maxProfix += prices[i + 1] - tempMin;
                    tempMin = -1;
                }
                // 跌点，卖出
                if (prices[i] > prices[i + 1]) {
                    maxProfix += prices[i] - tempMin;
                    tempMin = -1;
                    // 再次判断是否从下一天买入
                    if (i + 1 < prices.length - 1) {
                        if (prices[i + 1] < prices[i + 2]) {
                            tempMin = prices[i + 1];
                        }
                    }
                }
            }
        }
        return maxProfix;
    }
}