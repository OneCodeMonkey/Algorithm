// Runtime 27 ms Beats 56.93% 
// Memory 45.76 MB Beats 54.10%
// Brute-force & sort.
// T:O(m*n*k^2*log(k^2)), S:O(m*n)
//
class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int row = grid.length, col = grid[0].length, row1 = row - k + 1, col1 = col - k + 1;
        int[][] ret = new int[row1][col1];
        if (k == 1) {
            return ret;
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                int ans = Integer.MAX_VALUE;
                List<Integer> tmp = new ArrayList<>();
                for (int r = i; r < i + k; r++) {
                    for (int t = j; t < j + k; t++) {
                        tmp.add(grid[r][t]);
                    }
                }
                tmp.sort(Comparator.naturalOrder());
                for (int r = 0; r < tmp.size() - 1; r++) {
                    if (!tmp.get(r).equals(tmp.get(r + 1))) {
                        ans = Math.min(ans, Math.abs(tmp.get(r) - tmp.get(r + 1)));
                    }
                }
                ret[i][j] = ans == Integer.MAX_VALUE ? 0 : ans;
            }
        }

        return ret;
    }
}
