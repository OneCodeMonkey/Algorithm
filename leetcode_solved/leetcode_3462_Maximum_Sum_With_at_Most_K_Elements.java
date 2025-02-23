// Runtime 115 ms Beats 100.00% 
// Memory 77.70 MB Beats -%
// Sorting.
// T:O(m * n), S:O(m * n)
// 
class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        List<Integer> record = new ArrayList<>();
        int row = grid.length, col = grid[0].length;
        long ret = 0;
        for (int i = 0; i < row; i++) {
            Arrays.sort(grid[i]);
            for (int j = 0; j < limits[i]; j++) {
                record.add(grid[i][col - 1 - j]);
            }
        }
        Collections.sort(record, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            ret += record.get(i);
        }

        return ret;
    }
}
