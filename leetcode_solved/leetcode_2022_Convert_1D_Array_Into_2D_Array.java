// AC: Runtime: 4 ms, faster than 100.00% of Java online submissions for Convert 1D Array Into 2D Array.
// Memory Usage: 48.8 MB, less than 80.00% of Java online submissions for Convert 1D Array Into 2D Array.
// notice if m * n != original.length, should return new int[0][0]
// T:O(m * n), S:O(m * n)
//
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int size = original.length, pos = 0;
        if (m * n != size) {
            return new int[0][0];
        }
        int[][] ret = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ret[i][j] = original[pos++];
                if (pos == size) {
                    return ret;
                }
            }
        }

        return ret;
    }
}