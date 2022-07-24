// AC: Runtime: 8 ms, faster than 47.11% of Java online submissions for Maximum Score Of Spliced Array.
// Memory Usage: 54 MB, less than 94.46% of Java online submissions for Maximum Score Of Spliced Array.
// DP, Kadane algo, see @https://zhuanlan.zhihu.com/p/85188269
// T:O(n), S:O(1)
// 
class Solution {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int len = nums1.length, sum1 = 0, sum2 = 0, diffMax1 = 0, diffSumMax1 = 0, diffMax2 = 0, diffSumMax2 = 0;
        for (int i = 0; i < len; i++) {
            sum1 += nums1[i];
            sum2 += nums2[i];
            int diff = nums1[i] - nums2[i], diff2 = nums2[i] - nums1[i];
            diffSumMax1 = Math.max(diff, diff + diffSumMax1);
            diffMax1 = Math.max(diffMax1, diffSumMax1);
            diffSumMax2 = Math.max(diff2, diff2 + diffSumMax2);
            diffMax2 = Math.max(diffMax2, diffSumMax2);
        }

        return Math.max(sum1 + diffMax2, sum2 + diffMax1);
    }
}