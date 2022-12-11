// AC: Runtime 6 ms Beats 100% 
// Memory 46.5 MB Beats 66.67%
// Sort.
// T: O(m * nlogn), S:O(log(max(n)))
// 
class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int row = grid.length, col = grid[0].length, ret = 0;
        for (int[] rowArr : grid) {
            Arrays.sort(rowArr);
        }
        for (int i = 0; i < col; i++) {
            int colMax = 0;
            for (int[] ints : grid) {
                colMax = Math.max(colMax, ints[i]);
            }
            ret += colMax;
        }

        return ret;
    }
}
