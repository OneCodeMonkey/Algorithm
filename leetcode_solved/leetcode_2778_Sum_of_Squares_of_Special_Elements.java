// AC: 1ms Beats 100.00%of users with Java
// Memory: 43.22mb Beats 66.67%of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int sumOfSquares(int[] nums) {
        int len = nums.length, ret = 0;
        for (int i = 1; i <= len; i++) {
            if (len % i == 0) {
                ret += nums[i - 1] * nums[i - 1];
            }
        }

        return ret;
    }
}
