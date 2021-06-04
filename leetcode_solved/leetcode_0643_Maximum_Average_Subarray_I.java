// AC: Runtime: 2 ms, faster than 94.93% of Java online submissions for Maximum Average Subarray I.
// Memory Usage: 53.8 MB, less than 7.26% of Java online submissions for Maximum Average Subarray I.
// .
// T:O(n), S:O(1)
//
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int tempSum = 0, maxSum = 0, size = nums.length;
        for (int i = 0; i <= k - 1; i++) {
            tempSum += nums[i];
        }
        maxSum = tempSum;
        for (int i = 1; i + k - 1 < size; i++) {
            tempSum += nums[i + k - 1] - nums[i - 1];
            if (tempSum > maxSum) {
                maxSum = tempSum;
            }
        }
        return maxSum / (k * 1.00000);
    }
}