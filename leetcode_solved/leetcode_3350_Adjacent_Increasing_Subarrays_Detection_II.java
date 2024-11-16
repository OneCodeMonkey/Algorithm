// Runtime 14 ms Beats 100.00% 
// Memory 88.69 MB Beats 66.67%
// Array. Same as: Leetcode 3349.
// T:O(n), S:O(1)
// 
class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int len = nums.size(), k = 1;
        if (len == 2) {
            return k;
        }
        int cur = 1, prevIncrLen = 0;
        for (int i = 1; i < len; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                cur++;
                k = Math.max(k, cur / 2);
            } else {
                prevIncrLen = cur;
                cur = 1;
            }
            k = Math.max(k, Math.min(prevIncrLen, cur));
        }

        return k;
    }
}
