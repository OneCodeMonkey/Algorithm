// AC: Runtime: 7 ms, faster than 20.00% of Java online submissions for Number of Zero-Filled Subarrays.
// Memory Usage: 95.2 MB, less than 100.00% of Java online submissions for Number of Zero-Filled Subarrays.
// count continuous zero, sum every pieces' count, every piece can contribute n * (n+1)/2 .
// T:O(n), S:O(1)
// 
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int continousZeroCount = 0;
        long ret = 0;
        for (int num : nums) {
            if (num == 0) {
                continousZeroCount++;
            } else {
                if (continousZeroCount > 0) {
                    ret += (long) continousZeroCount * (continousZeroCount + 1) / 2;
                    continousZeroCount = 0;
                }
            }
        }
        if (continousZeroCount > 0) {
            ret += (long) continousZeroCount * (continousZeroCount + 1) / 2;
        }

        return ret;
    }
}