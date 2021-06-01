// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Teemo Attacking.
// Memory Usage: 40.8 MB, less than 82.64% of Java online submissions for Teemo Attacking.
// .
// T:o(n), S:O(1)
//
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ret = 0, size = timeSeries.length, lastEnd = -1;
        for (int timeSery : timeSeries) {
            ret += duration;
            if (timeSery <= lastEnd) {
                ret -= (lastEnd - timeSery + 1);
            }
            lastEnd = timeSery + duration - 1;
        }

        return ret;
    }
}