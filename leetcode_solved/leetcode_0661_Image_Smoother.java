// AC: Runtime 7 ms Beats 50.42% of users with Java
// Memory 44.70 MB Beats 46.78% of users with Java
// Calculate by each cell.
// T:O(m * n * 9), S:O(m * n)
// 
class Solution {
    public int[][] imageSmoother(int[][] img) {
        int row = img.length, col = img[0].length;
        int[][] ret = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int sum = 0, count = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int t = j - 1; t <= j + 1; t++) {
                        if (k >= 0 && k < row && t >= 0 && t < col) {
                            sum += img[k][t];
                            count++;
                        }
                    }
                }
                ret[i][j] = (int) Math.floor(sum * 1.0 / count);
            }
        }

        return ret;
    }
}
