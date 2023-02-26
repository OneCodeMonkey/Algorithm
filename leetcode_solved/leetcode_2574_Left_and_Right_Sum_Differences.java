// AC: Runtime 1 ms Beats 100% 
// Memory 43 MB Beats 50%
// Prefix sum.
// T:O(n), S:O(n)
// 
class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int len = nums.length, pos = 0, sumLeft = 0, sumRight = 0;
        int[] leftSum = new int[len + 1], rightSum = new int[len + 2], ret = new int[len];
        for (int i = 0; i < len; i++) {
            sumLeft += nums[i];
            sumRight += nums[len - 1 - i];
            leftSum[i + 1] = sumLeft;
            rightSum[len - i] = sumRight;
        }

        for (int i = 0; i < len; i++) {
            ret[pos++] = Math.abs(leftSum[i] - rightSum[i + 2]);
        }

        return ret;
    }
}
