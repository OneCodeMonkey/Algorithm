// AC: Runtime 9 ms Beats 74.55%
// Memory 61.1 MB Beats 92.12%
// DP.
// T:O(n), S:O(1)
// 
class Solution {
    public int minimizeArrayValue(int[] nums) {
        int count = 0, ret = 0;
        long sum = 0;
        for (int num : nums) {
            sum += num;
            count++;
            ret = Math.max(ret, (int) Math.ceil(sum * 1.0 / count));
        }

        return ret;
    }
}
