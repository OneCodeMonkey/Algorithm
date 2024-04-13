// Runtime 1 ms Beats 100.00% of users with Java
// Memory 42.66 MB Beats 100.00% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ret1 = 1, ret2 = 1, cur1 = 1, cur2 = 1, prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > prev) {
                cur1++;
                ret1 = Math.max(ret1, cur1);
            } else {
                cur1 = 1;
            }
            if (nums[i] < prev) {
                cur2++;
                ret2 = Math.max(ret2, cur2);
            } else {
                cur2 = 1;
            }
            prev = nums[i];
        }

        return Math.max(ret1, ret2);
    }
}
