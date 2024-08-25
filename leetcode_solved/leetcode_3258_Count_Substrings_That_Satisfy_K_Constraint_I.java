// Runtime 10 ms Beats 100.00%
// Memory 43.94 MB Beats 100.00%
// Brute-force.
// T:O(n^2), S:O(1)
// 
class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int ret = 0;
        HashMap<Character, Integer> record = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            record.clear();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                record.merge(c, 1, Integer::sum);
                if (record.getOrDefault('0', 0) > k && record.getOrDefault('1', 0) > k) {
                    break;
                }
                ret++;
            }
        }

        return ret;
    }
}
