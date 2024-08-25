// Solution 1: Greedy & 剪枝
// Runtime 26 ms Beats 100.00%
// Memory 45.71 MB Beats 100.00%
// Greedy & 剪枝：化 二维为 一维数组，先排序，按最大值去尝试组合。如果两层 for 循环后 理论 3个的最大值小于当前 max，那么跳过第三层 for 循环
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


// Solution 2: todo - 论坛看到的 graph，edge 的做法