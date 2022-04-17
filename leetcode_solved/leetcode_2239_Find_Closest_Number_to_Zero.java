// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Find Closest Number to Zero.
// Memory Usage: 42 MB, less than 83.33% of Java online submissions for Find Closest Number to Zero.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int findClosestNumber(int[] nums) {
        int ret = Integer.MAX_VALUE, minAbs = Integer.MAX_VALUE;
        for (int num : nums) {
            int abs = Math.abs(num);
            if (abs < minAbs) {
                minAbs = abs;
                ret = num;
            } else if (abs == minAbs && num > ret) {
                ret = num;
            }
        }

        return ret;
    }
}