// AC: Runtime: 3 ms, faster than 32.97% of Java online submissions for Add Minimum Number of Rungs.
// Memory Usage: 52 MB, less than 78.33% of Java online submissions for Add Minimum Number of Rungs.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int addRungs(int[] rungs, int dist) {
        int ret = 0, size = rungs.length;

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                ret += Math.ceil((rungs[i] - dist) / (dist * 1.0));
            } else {
                ret += Math.ceil((rungs[i] - rungs[i - 1] - dist) / (dist * 1.0));
            }
        }

        return ret;
    }
}