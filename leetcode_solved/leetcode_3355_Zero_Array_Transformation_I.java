// AC: Runtime 48 ms Beats 100.00%
// Memory 103.58 MB Beats 100.00%
// Segment Recording. Using two map to record the segment start and end, While traveling accumulate the steps.
// T:O(n), S:O(n)
// 
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int len = nums.length;
        HashMap<Integer, Integer> segmentStartRecord = new HashMap<>(), segmentEndRecord = new HashMap<>();
        for (int[] query : queries) {
            int start = query[0], end = query[1];
            segmentStartRecord.merge(start, 1, Integer::sum);
            segmentEndRecord.merge(end + 1, 1, Integer::sum);
        }
        int cur = 0;
        for (int i = 0; i < len; i++) {
            cur += segmentStartRecord.getOrDefault(i, 0) - segmentEndRecord.getOrDefault(i, 0);
            if (nums[i] > cur) {
                return false;
            }
        }

        return true;
    }
}
