// AC: Runtime: 35 ms, faster than 88.85% of Java online submissions for Largest Combination With Bitwise AND Greater Than Zero.
// Memory Usage: 74.1 MB, less than 84.08% of Java online submissions for Largest Combination With Bitwise AND Greater Than Zero.
// bit manipulation, find max count that & "single-bit-one" binary number > 0,
// T:O(log(max(nums[i])) * n), S:O(1)
// 
class Solution {
    public int largestCombination(int[] candidates) {
        int maxElem = 0, ret = 0, len = candidates.length;
        for (int i : candidates) {
            maxElem = Math.max(maxElem, i);
        }
        for (int i = 1; i <= maxElem; i = i << 1) {
            int count = 0;
            for (int j : candidates) {
                if ((i & j) > 0) {
                    count++;
                }
            }
            ret = Math.max(ret, count);
        }

        return ret;
    }
}