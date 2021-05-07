// AC:
// Runtime: 4 ms, faster than 28.30% of Java online submissions for Bulb Switcher III.
// Memory Usage: 47.5 MB, less than 93.77% of Java online submissions for Bulb Switcher III.
// 思路：略
// 复杂度：T：O(n), S:O(1)
//
class Solution {
    public int numTimesAllBlue(int[] light) {
        int ret = 0;
        long tempSum = 0;
        for (int i = 0; i < light.length; i++) {
            tempSum += light[i];
            if (tempSum == (long)(i + 1) * (long)(i + 2) / 2) {
                ret++;
            }
        }
        return ret;
    }
}