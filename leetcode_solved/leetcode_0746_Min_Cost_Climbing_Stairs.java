// AC: Runtime: 1 ms, faster than 77.14% of Java online submissions for Min Cost Climbing Stairs.
// Memory Usage: 39 MB, less than 18.83% of Java online submissions for Min Cost Climbing Stairs.
// DP problem
// T:O(n), S:O(n)
// 
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        int[] dp = new int[size + 2];
        dp[0] = 0;
        dp[1] = cost[0];
        for (int i = 2; i <= size + 1; i++) {
            // cost[size] = 0; 爬到最顶层没有代价
            int curCost = 0;
            if (i != size + 1) {
                curCost = cost[i - 1];
            }

            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + curCost;
        }

        return dp[size + 1];
    }
}