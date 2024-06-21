// Runtime 27 ms Beats 100.00%
// Memory 94.30 MB Beats 100.00%
// Prefix sum & hashmap.
// T:O(n), S:O(1)
// 
class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long ret = 0;
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int hour : hours) {
            int remain = hour % 24;
            ret += record.getOrDefault((24 - remain) % 24, 0);
            record.merge(hour % 24, 1, Integer::sum);
        }

        return ret;
    }
}
