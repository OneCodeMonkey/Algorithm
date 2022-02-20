// AC: Runtime: 8 ms, faster than 56.63% of Java online submissions for Remove Covered Intervals.
// Memory Usage: 46.7 MB, less than 11.39% of Java online submissions for Remove Covered Intervals.
// sort by a[0] lower and a[1] larger, and check right bound, whenever right bound is larger, then will get a new interval.
// T:O(nlogn), S:O(logn)
//
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            return a[0] == b[0] ? b[1] - a[1] : a[0] - b[0];
        });
        int ret = 0, rightBound = Integer.MIN_VALUE;
        for (int[] interval:intervals) {
            if (interval[1] > rightBound) {
                ret++;
                rightBound = interval[1];
            }
        }

        return ret;
    }
}