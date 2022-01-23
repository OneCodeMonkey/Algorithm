// AC: Runtime: 4 ms, faster than 44.21% of Java online submissions for Number of Subarrays with Bounded Maximum.
// Memory Usage: 48.3 MB, less than 42.81% of Java online submissions for Number of Subarrays with Bounded Maximum.
// count ret of range <= right and ret of range <= left, their diff is the answer.
// T:O(n), S:O(n)
// 
class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int size = nums.length, ret1 = 0, ret2 = 0;
        int[] dp1 = new int[size + 1], dp2 = new int[size + 1];
        for (int i = 0; i < size; i++) {
            if (nums[i] <= right) {
                dp1[i + 1] = dp1[i] + 1;
                ret1 += dp1[i + 1];
            } else {
                dp1[i + 1] = 0;
            }

            if (nums[i] <= left - 1) {
                dp2[i + 1] = dp2[i] + 1;
                ret2 += dp2[i + 1];
            } else {
                dp2[i + 1] = 0;
            }
        }

        return ret1 - ret2;
    }
}