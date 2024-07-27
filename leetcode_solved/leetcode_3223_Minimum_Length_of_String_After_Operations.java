// Runtime 78 ms Beats 100.00%
// Memory 50.59 MB Beats 100.00%
// Map.
// T:O(n), S:O(1)
// 
class Solution {
    public int minimumLength(String s) {
        HashMap<Character, Integer> record = new HashMap<>();
        int ret = 0;
        for (char c : s.toCharArray()) {
            record.merge(c, 1, Integer::sum);
        }
        for (char c : record.keySet()) {
            ret += record.get(c) % 2 == 1 ? 1 : 2;
        }

        return ret;
    }
}
