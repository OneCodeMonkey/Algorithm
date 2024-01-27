// Runtime 2 ms Beats 100.00% of users with Java
// Memory 41.64 MB Beats 100.00% of users with Java
// Greedy: map
// T:O(n), S:O(n)
// 
class Solution {
    public int minimumPushes(String word) {
        int len = word.length(), ret = len;
        if (len > 8) {
            Map<Character, Integer> record = new HashMap<>();
            for (char c : word.toCharArray()) {
                record.merge(c, 1, Integer::sum);
            }
            if (record.size() > 24) {
                ret = 8 + 8 * 2 + 8 * 3 + (record.size() - 24) * 4;
            } else if (record.size() > 16) {
                ret = 8 + 8 * 2 + (record.size() - 16) * 3;
            } else if (record.size() > 8) {
                ret = 8 + (record.size() - 8) * 2;
            } else {
                ret = record.size() - 8;
            }
        }

        return ret;
    }
}
