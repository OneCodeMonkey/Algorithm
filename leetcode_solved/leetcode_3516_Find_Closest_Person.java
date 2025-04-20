// Runtime 1 ms Beats 100.00% 
// Memory 41.48 MB Beats 100.00%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int findClosest(int x, int y, int z) {
        int ret = 0, t0 = Math.abs(x - z), t1 = Math.abs(y - z);
        if (t0 < t1) {
            ret = 1;
        } else if (t0 > t1) {
            ret = 2;
        }

        return ret;
    }
}
