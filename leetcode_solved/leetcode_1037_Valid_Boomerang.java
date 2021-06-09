// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Boomerang.
// Memory Usage: 36.5 MB, less than 50.00% of Java online submissions for Valid Boomerang.
// Using (y1 - y2) * (x1 - x3) == (y1 - y3) * (x1 - x2) to check if three points are on one line.
// T:O(1), S:O(1)
//
class Solution {
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0], x2 = points[1][0], x3 = points[2][0];
        int y1 = points[0][1], y2 = points[1][1], y3 = points[2][1];
        if ((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x2 == x3 && y2 == y3)) {
            return false;
        }

        if ((y1 - y2) * (x1 - x3) == (y1 - y3) * (x1 - x2)) {
            return false;
        }
        return true;
    }
}
