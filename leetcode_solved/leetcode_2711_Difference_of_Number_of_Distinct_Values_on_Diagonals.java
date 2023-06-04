// AC: Runtime 23 ms Beats 50% 
// Memory 44.6 MB Beats 25%
// Brute-force
// T:O(m * n * min(m, n)), S:O(m * n)
// 
class Solution {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[][] ret = new int[row][col];
        HashSet<Integer> record = new HashSet<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int leftCount = 0, rightCount = 0, posRow = i - 1, posCol = j - 1;
                record.clear();
                while (posRow >= 0 && posCol >= 0) {
                    record.add(grid[posRow][posCol]);
                    posRow--;
                    posCol--;
                }
                leftCount = record.size();
                record.clear();
                posRow = i + 1;
                posCol = j + 1;
                while (posRow < row && posCol < col) {
                    record.add(grid[posRow][posCol]);
                    posRow++;
                    posCol++;
                }
                rightCount = record.size();
                ret[i][j] = Math.abs(leftCount - rightCount);
            }
        }

        return ret;
    }
}