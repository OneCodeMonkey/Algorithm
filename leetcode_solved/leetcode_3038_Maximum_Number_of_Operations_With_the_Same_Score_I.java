// Runtime 0 ms Beats 100.00% of users with Java
// Memory 41.60 MB Beats 100.00% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int maxOperations(int[] nums) {
        int ret = 1, sum1 = nums[0] + nums[1];
        for (int i = 2; i + 1 < nums.length; i += 2) {
            if (nums[i] + nums[i + 1] == sum1) {
                ret++;
            } else {
                break;
            }
        }

        return ret;
    }
}
