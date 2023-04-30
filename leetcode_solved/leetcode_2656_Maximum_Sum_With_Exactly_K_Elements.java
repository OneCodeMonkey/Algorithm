// AC: Runtime 2 ms Beats 100% 
// Memory 43.2 MB Beats 16.67%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int maximizeSum(int[] nums, int k) {
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        int ret = (maxVal + maxVal + k - 1) * k / 2;

        return ret;
    }
}
