// Runtime 1 ms Beats 100.00% of users with Java
// Memory 43.00 MB Beats 100.00% of users with Java
// Brute-force.
// T:O(m * n), S:O(1)
// 
class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int ret = 0;
        for (int num : nums1) {
            if (num % k == 0) {
                for (int num2 : nums2) {
                    if (num >= num2 && num % (num2 * k) == 0) {
                        ret++;
                    }
                }
            }
        }

        return ret;
    }
}
