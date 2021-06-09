// AC: Runtime: 4 ms, faster than 83.33% of Java online submissions for Largest Triangle Area.
// Memory Usage: 36.5 MB, less than 87.14% of Java online submissions for Largest Triangle Area.
// thought: using the vector product formula: (x1, y1), (x2, y2), (x3, y3), 
//       area = Math.abs((x1 -x2) * (y1 - y3) - (x1 - x3) * (x1 - x2)) / 2
// T:O(n^3), S:O(1)
//
class Solution {
    public double largestTriangleArea(int[][] points) {
        int size = points.length;
        double ret = 0;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                int x = points[i][0] - points[j][0];
                int y = points[i][1] - points[j][1];
                for (int k = j + 1; k < size; k++) {
                    int x1 = points[i][0] - points[k][0];
                    int y1 = points[i][1] - points[k][1];
                    double area = Math.abs(x * y1 - y * x1) / (2 * 1.000000);
                    if (area > ret) {
                        ret = area;
                    }
                }
            }
        }
        
        return ret;
    }
}