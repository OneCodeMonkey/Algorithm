// AC: Runtime: 15 ms, faster than 7.47% of Java online submissions for Car Pooling.
// Memory Usage: 41.5 MB, less than 16.67% of Java online submissions for Car Pooling.
// using an array to restore the number of passenger at every position
// T:O(sum(trip distance)), S:O(max(trip distance))
// 
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] record = new int[1001];
        for (int[] trip : trips) {
            for (int i = trip[1]; i < trip[2]; i++) {
                record[i] += trip[0];
            }
        }

        for (int i: record) {
            if (i > capacity) {
                return false;
            }
        }

        return true;
    }
}