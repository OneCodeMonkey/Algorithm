// AC: Runtime 8 ms Beats 90.51% 
// Memory 58.8 MB Beats 22.77%
// Greedy.
// T:O(n), S:O(1)
// 
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int len = neededTime.length, ret = 0, curMax = Integer.MAX_VALUE, curSameSequenceSum = 0;
        char prev = ' ';
        for (int i = 0; i < len; i++) {
            char curColor = colors.charAt(i);
            if (i == 0) {
                curMax = neededTime[i];
                curSameSequenceSum = neededTime[i];
                prev = curColor;
                continue;
            }
            if (curColor == prev) {
                curMax = Math.max(curMax, neededTime[i]);
                curSameSequenceSum += neededTime[i];
                if (i == len - 1) {
                    ret += curSameSequenceSum - curMax;
                }
            } else {
                ret += curSameSequenceSum - curMax;
                curMax = neededTime[i];
                curSameSequenceSum = neededTime[i];
            }
            prev = curColor;
        }

        return ret;
    }
}
