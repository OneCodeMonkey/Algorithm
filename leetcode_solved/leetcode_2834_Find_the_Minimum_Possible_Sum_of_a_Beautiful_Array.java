// AC: Runtime 1 ms Beats 100%
// Memory 39.4 MB Beats 100%
// Greedy & Constructive
// T:O(n), S:O(1)
// 
class Solution {
    public long minimumPossibleSum(int n, int target) {
        long ret = 0, cur = 0;
        int count = 0;
        boolean hasReachTarget = false;
        while (count < n) {
            if (!hasReachTarget && cur + cur + 1 >= target) {
                cur = target;
                hasReachTarget = true;
            } else {
                cur++;
            }
            ret += cur;
            count++;
        }

        return ret;
    }
}
