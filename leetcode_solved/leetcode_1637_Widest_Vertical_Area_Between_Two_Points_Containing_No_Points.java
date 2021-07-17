// AC: Runtime: 12 ms, faster than 79.75% of Java online submissions for Widest Vertical Area Between Two Points Containing No Points.
// Memory Usage: 67.8 MB, less than 59.34% of Java online submissions for Widest Vertical Area Between Two Points Containing No Points.
// sort the x-axis values, and find the max diff between any adjacent values.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int size = points.length, pos = 0, ret = 0;
        int[] recordX = new int[size];
        for (int[] point: points) {
            recordX[pos++] = point[0];
        }
        Arrays.sort(recordX);
        for (int i = 0; i < size - 1; i++) {
            ret = Math.max(ret, recordX[i + 1] - recordX[i]);
        }
        
        return ret;
    }
}