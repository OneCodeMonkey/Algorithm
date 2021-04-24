// AC:
// Runtime: 1 ms, faster than 28.87% of Java online submissions for Minimum Time Visiting All Points.
// Memory Usage: 40.6 MB, less than 5.18% of Java online submissions for Minimum Time Visiting All Points.
// 思路：按题目描述的行走距离计算方法，注意当 x坐标差小于 y 坐标差时，需要加上 y 方向额外行走的可能最小距离
// 复杂度: T:O(n), S:O(1)
//
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ret = 0;
        for (int i = 0; i < points.length - 1; i++) {
            ret += getDistanceByPoints(points[i], points[i + 1]);
        }

        return ret;
    }

    private int getDistanceByPoints(int[] point1, int[] point2) {
        int xMove = Math.abs(point1[0] - point2[0]), yMove = 0;
        int yDis = Math.abs(point1[1] - point2[1]);
        if (yDis > xMove) {
            yMove = Math.min(Math.min(Math.abs(point1[1] - point2[1]), Math.abs(point1[1] + xMove - point2[1])), Math.abs(point1[1] - xMove - point2[1]));
        }

        return  xMove + yMove;
    }
}