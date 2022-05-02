// AC: Runtime: 15 ms, faster than 88.69% of Java online submissions for Number of Ways to Buy Pens and Pencils.
// Memory Usage: 40.8 MB, less than 18.75% of Java online submissions for Number of Ways to Buy Pens and Pencils.
// .
// T:O(total / max(cost1, cost2)), S:O(1)
// 
class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ret = 0;
        int max = Math.max(cost1, cost2), min = Math.min(cost1, cost2), curMaxSum = 0;
        while (curMaxSum <= total) {
            if (total - curMaxSum < 0) {
                break;
            }
            ret += (total - curMaxSum) / min + 1;
            curMaxSum += max;
        }

        return ret;
    }
}