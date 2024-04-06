// Runtime 3 ms Beats 100.00% of users with Java
// Memory 55.56 MB Beats 100.00% of users with Java
// Count every continous and not-joined alternative subarray, which length is k, add k * (k - 1) / 2 to the answer starting from N.
// T:O(n), S:O(1)
// 
class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        int len = nums.length, cur = 1;
        long ret = len;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[i - 1]) {
                cur++;
                if (i == len - 1) {
                    ret += (long) cur * (cur - 1) / 2;
                }
            } else {
                ret += (long) cur * (cur - 1) / 2;
                cur = 1;
            }
        }

        return ret;
    }
}
