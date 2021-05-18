// AC: Runtime: 9 ms, faster than 82.45% of Java online submissions for Top K Frequent Elements.
// Memory Usage: 41.7 MB, less than 29.13% of Java online submissions for Top K Frequent Elements.
// 略.
// T:O(n), S:O(n)
//
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i: nums) {
            record.merge(i, 1, Integer::sum);
        }
        int[][] table = new int[record.keySet().size()][2];
        int pos = 0;
        for (int i: record.keySet()) {
            table[pos++] = new int[]{i, record.get(i)};
        }
        Arrays.sort(table, (a, b) -> (b[1] - a[1]));
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = table[i][0];
        }
        return ret;
    }
}