// Runtime 0 ms Beats 100.00% of users with Java
// Memory 42.98 MB Beats 100.00% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i] - nums[i - 1]) % 2 == 0) {
                return false;
            }
        }

        return true;
    }
}
