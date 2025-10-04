// Runtime 1 ms Beats 100.00% 
// Memory 45.48 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int earliestTime(int[][] tasks) {
        int ret = Integer.MAX_VALUE;
        for (int[] item : tasks) {
            ret = Math.min(ret, item[0] + item[1]);
        }

        return ret;
    }
}
