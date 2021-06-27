// AC: Runtime: 15 ms, faster than 97.12% of Java online submissions for Queries on Number of Points Inside a Circle.
// Memory Usage: 39.6 MB, less than 59.50% of Java online submissions for Queries on Number of Points Inside a Circle.
// check (x - xi)^2 + (y - yi)^2 <= r^2
// T:O(n), S:O(1)
// 
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int sizeQuery = queries.length, sizePoint = points.length;
        int[] ret = new int[sizeQuery];
        for (int i = 0; i < sizeQuery; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int tempCount = 0;
            for (int j = 0; j < sizePoint; j++) {
                if ((points[j][0] - x) * (points[j][0] - x) + (points[j][1] - y) * (points[j][1] - y) <= queries[i][2] * queries[i][2]) {
                    tempCount++;
                }
            }
            ret[i] = tempCount;
        }

        return ret;
    }
}