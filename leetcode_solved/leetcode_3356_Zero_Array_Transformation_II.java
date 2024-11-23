// AC: Runtime 36 ms Beats 100.00%
// Memory 120.47 MB Beats 100.00%
// Segment recording: Same as Leetcode3355. The only difference is to calculate segment if condition not ok.
// T:O(n), S:O(n)
// 
class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int len = nums.length, len2 = queries.length;
        HashMap<Integer, Integer> segmentStartRecord = new HashMap<>(), segmentEndRecord = new HashMap<>();
        int cur = 0, pos = 0;
        for (int i = 0; i < len; i++) {
            cur += segmentStartRecord.getOrDefault(i, 0) - segmentEndRecord.getOrDefault(i, 0);
            if (nums[i] > cur) {
                for (int j = pos; j < len2; j++) {
                    int start = queries[j][0], end = queries[j][1], step = queries[j][2];
                    segmentStartRecord.merge(start, step, Integer::sum);
                    segmentEndRecord.merge(end + 1, step, Integer::sum);
                    pos++;
                    if (start <= i && end >= i) {
                        cur += step;
                    }
                    if (nums[i] <= cur) {
                        break;
                    }
                }
                // not find after all queries occupied.
                if (nums[i] > cur) {
                    return -1;
                }
            }
        }

        return pos;
    }
}
