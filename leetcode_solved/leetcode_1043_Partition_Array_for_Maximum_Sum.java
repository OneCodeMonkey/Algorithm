// AC: Runtime: 6 ms, faster than 70.41% of Java online submissions for Partition Array for Maximum Sum.
// Memory Usage: 43 MB, less than 8.46% of Java online submissions for Partition Array for Maximum Sum.
// DP. for every dp[i], we check from arr[i] to arr[i - min(arr.length, k)] and get maximum
// T:O(n * k), S:O(n)
// 
class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int size = arr.length, ret = 0;
        int[] dp = new int[size + 1];
        for (int i = 0; i < size; i++) {
            int curMax = 0, max = 0;
            for (int j = 1; j <= k && j <= i + 1; j++) {
                curMax = Math.max(curMax, arr[i - j + 1]);
                max = Math.max(max, dp[i - j + 1] + curMax * j);
            }
            dp[i + 1] = max;
        }

        return dp[size];
    }
}