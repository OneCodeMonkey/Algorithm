// Runtime 168 ms Beats 100.00%
// Memory 78.58 MB Beats 100.00%
// Greedy & 剪枝
// T:O(m^2 * n^2), S:O(m * n)
// 
class Solution {
    public long maximumValueSum(int[][] board) {
        int row = board.length, col = board[0].length;
        int[][] allElems = new int[row * col][3];
        int pos = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                allElems[pos][0] = i;
                allElems[pos][1] = j;
                allElems[pos][2] = board[i][j];
                pos++;
            }
        }
        Arrays.sort(allElems, (a, b) -> b[2] - a[2]);
        long maxSum = 3L * Integer.MIN_VALUE;
        for (int i = 0; i < row * col; i++) {
            for (int j = i + 1; j < row * col; j++) {
                if (allElems[i][0] == allElems[j][0] || allElems[i][1] == allElems[j][1]) {
                    continue;
                }
                long curSum = allElems[i][2] + allElems[j][2];
                if (curSum + allElems[j][2] <= maxSum) {
                    break;
                }
                for (int k = j + 1; k < row * col; k++) {
                    if (curSum + allElems[k][2] <= maxSum) {
                        break;
                    }
                    if (allElems[k][0] == allElems[i][0] || allElems[k][1] == allElems[i][1] ||
                            allElems[k][0] == allElems[j][0] || allElems[k][1] == allElems[j][1]) {
                        continue;
                    }
                    maxSum = curSum + allElems[k][2];
                    break;
                }
            }
        }

        return maxSum;
    }
}
