// Runtime 1 ms Beats 97.67% 
// Memory 44.78 MB Beats 95.61%
// .
// T:O(n), S:(n)
// 
class Solution {
    public int[] minCosts(int[] cost) {
        int len = cost.length, minVal = cost[0];
        int[] ret = new int[len];
        for (int i = 0; i < len; i++) {
            minVal = Math.min(minVal, cost[i]);
            ret[i] = minVal;
        }

        return ret;
    }
}
