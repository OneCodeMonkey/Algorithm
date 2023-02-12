// AC: Runtime 11 ms Beats 14.29% 
// Memory 42.7 MB Beats 14.29%
// .
// T:O(sum(logni)). S:O(max(logni))
// 
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ret = 0;
        for (int i = 0, j = nums.length - 1; j - i >= 1; i++, j--) {
            ret += Integer.parseInt(String.valueOf(nums[i]) + nums[j]);
            if (j - i == 2) {
                ret += nums[i + 1];
            }
        }

        return ret;
    }
}
