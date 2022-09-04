// AC: Runtime: 21 ms, faster than 94.46% of Java online submissions for Minimum Amount of Time to Collect Garbage.
// Memory Usage: 69 MB, less than 91.62% of Java online submissions for Minimum Amount of Time to Collect Garbage.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int maxM = -1, maxP = -1, maxG = -1, curSum = 0, ret = 0, garbageCount = 0;
        for (int i = 0; i < garbage.length; i++) {
            garbageCount += garbage[i].length();
            if (garbage[i].indexOf('M') != -1) {
                maxM = Math.max(maxM, i);
            }
            if (garbage[i].indexOf('G') != -1) {
                maxG = Math.max(maxG, i);
            }
            if (garbage[i].indexOf('P') != -1) {
                maxP = Math.max(maxP, i);
            }
        }
        ret += garbageCount;
        for (int i = 0; i < garbage.length; i++) {
            curSum += i == 0 ? 0 : travel[i - 1];
            if (i == maxM) {
                ret += curSum;
            }
            if (i == maxP) {
                ret += curSum;
            }
            if (i == maxG) {
                ret += curSum;
            }
        }
        return ret;
    }
}
