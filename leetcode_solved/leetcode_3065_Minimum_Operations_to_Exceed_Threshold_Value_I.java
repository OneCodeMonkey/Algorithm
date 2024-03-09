// Runtime 0 ms Beats 100.00% of users with Java
// Memory 42.42 MB Beats 100.00% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int minOperations(int[] nums, int k) {
        int ret = 0;
        for (int num : nums) {
            if (num < k) {
                ret++;
            }
        }

        return ret;
    }
}
