// AC: Runtime: 2 ms, faster than 100.00% of Java online submissions for Sum of Absolute Differences in a Sorted Array.
// Memory Usage: 59.3 MB, less than 88.26% of Java online submissions for Sum of Absolute Differences in a Sorted Array.
// prefixSum
// T:O(n), S:O(n)
// 
class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int leftSum = 0, rightSum = 0, size = nums.length;
        int[] ret = new int[size];
        for (int i : nums) {
            rightSum += i;
        }
        for (int i = 0; i < size; i++) {
            rightSum -= nums[i];
            if (i > 0) {
                leftSum += nums[i - 1];
            }
            ret[i] = rightSum - nums[i] * (size - 1 - i) + (-1) * (leftSum - nums[i] * i);
        }

        return ret;
    }
}
