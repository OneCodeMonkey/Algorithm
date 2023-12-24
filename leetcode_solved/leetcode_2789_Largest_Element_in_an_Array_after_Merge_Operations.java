// AC: Runtime 1 ms Beats 100.00% of users with Java
// Memory 58.48 MB Beats 21.79% of users with Java
// Greedy.
// T:O(n), S:O(1)
// 
class Solution {
    public long maxArrayValue(int[] nums) {
        int len = nums.length;
        long curMax = nums[len - 1], ret = curMax;
        for (int i = len - 1; i >= 1; i--) {
            if (curMax >= nums[i - 1]) {
                curMax += nums[i - 1];
            } else {
                curMax = nums[i - 1];
            }
            ret = Math.max(ret, curMax);
        }

        return ret;
    }
}
