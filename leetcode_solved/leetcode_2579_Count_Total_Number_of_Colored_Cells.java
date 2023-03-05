// AC: Runtime 0 ms Beats 100% 
// Memory 39.3 MB Beats 100%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public long coloredCells(int n) {
        return 2 * (long) n * (n - 1) + 1;
    }
}
