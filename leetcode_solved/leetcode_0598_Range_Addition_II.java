// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Addition II.
// Memory Usage: 38.4 MB, less than 92.55% of Java online submissions for Range Addition II.
// 最终最大值区域即矩形重叠次数最多的区域，可以直观看到宽和高出现的最小值会是这个重叠最多的区域
// T:O(m * n), S:O(1)
//
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m * n;
        }
        int xMin = Integer.MAX_VALUE, yMin = Integer.MAX_VALUE;
        for (int[] row: ops) {
            if (row[0] < xMin) {
                xMin = row[0];
            }
            if (row[1] < yMin) {
                yMin = row[1];
            }
        }
        return xMin * yMin;
    }
}