// AC: Runtime: 82 ms, faster than 48.52% of Java online submissions for Maximum Length of Repeated Subarray.
// Memory Usage: 99 MB, less than 12.54% of Java online submissions for Maximum Length of Repeated Subarray.
// dp
// T:O(m * n), S:O(m * n)
// 
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int size1 = nums1.length, size2 = nums2.length, ret = 0;
        if (size1 == 0 || size2 == 0) {
            return ret;
        }
        int[][] dp = new int[size1 + 1][size2 + 1];

        for (int i = 1; i <= size1; i++) {
            for (int j = 1; j <= size2; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    ret = Math.max(ret, dp[i][j]);
                }
            }
        }

        return ret;
    }
}