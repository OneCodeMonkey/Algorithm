// AC: Runtime 1 ms Beats 100.00% of users with Java
// Memory 56.65 MB Beats 53.61% of users with Java
// Get the XOR sum and compare bit difference.
// T:O(n), S:O(1)
// 
class Solution {
    public int minOperations(int[] nums, int k) {
        int xorSum = 0, ret = 0;
        for (int num : nums) {
            xorSum ^= num;
        }
        while (xorSum > 0 || k > 0) {
            if (xorSum % 2 != k % 2) {
                ret++;
            }
            xorSum /= 2;
            k /= 2;
        }

        return ret;
    }
}
