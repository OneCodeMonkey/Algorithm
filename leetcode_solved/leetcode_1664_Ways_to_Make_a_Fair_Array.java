// AC: Runtime 12 ms Beats 25.14% 
// Memory 54.9 MB Beats 16.39%
// Prefix sum.
// T:O(n), S:O(n)
// 
class Solution {
    public int waysToMakeFair(int[] nums) {
        int len = nums.length, ret = 0;
        int[] leftOddSum = new int[len + 1], leftEvenSum = new int[len + 1], rightOddSum = new int[len + 2],
                rightEvenSum = new int[len + 2];
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                leftEvenSum[i + 1] = leftEvenSum[i] + nums[i];
                leftOddSum[i + 1] = leftOddSum[i];
            } else {
                leftOddSum[i + 1] = leftOddSum[i] + nums[i];
                leftEvenSum[i + 1] = leftEvenSum[i];
            }
        }
        for (int i = len - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                rightEvenSum[i + 1] = rightEvenSum[i + 2] + nums[i];
                rightOddSum[i + 1] = rightOddSum[i + 2];
            } else {
                rightOddSum[i + 1] = rightOddSum[i + 2] + nums[i];
                rightEvenSum[i + 1] = rightEvenSum[i + 2];
            }
        }

        for (int i = 0; i < len; i++) {
            int oddSum = 0, evenSum = 0;
            oddSum = leftOddSum[i] + rightEvenSum[i + 2];
            evenSum = leftEvenSum[i] + rightOddSum[i + 2];
            if (oddSum == evenSum) {
                ret++;
            }
        }

        return ret;
    }
}
