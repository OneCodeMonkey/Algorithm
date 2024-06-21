// Runtime 2 ms Beats 100.00% 
// Memory 42.29 MB Beats 50.00%
// Prefix sum & hashmap.
// T:O(n), S:O(1)
// 
class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int ret = 0;
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int hour : hours) {
            int remain = hour % 24;
            ret += record.getOrDefault((24 - remain) % 24, 0);
            record.merge(hour % 24, 1, Integer::sum);
        }

        return ret;
    }
}
