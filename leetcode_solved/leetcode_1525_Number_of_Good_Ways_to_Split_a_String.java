// AC: Runtime: 29 ms, faster than 32.35% of Java online submissions for Number of Good Ways to Split a String.
// Memory Usage: 39.5 MB, less than 66.23% of Java online submissions for Number of Good Ways to Split a String.
// hashmap
// T:O(n), S:O(n)
// 
class Solution {
    public int numSplits(String s) {
        HashMap<Character, Integer> record = new HashMap<>();
        HashMap<Character, Integer> recordLeft = new HashMap<>();
        for (char c: s.toCharArray()) {
            record.merge(c, 1, Integer::sum);
        }
        int ret = 0;
        for (char c: s.toCharArray()) {
            recordLeft.merge(c, 1, Integer::sum);
            if (record.get(c) == 1) {
                record.remove(c);
            } else {
                record.merge(c, -1, Integer::sum);
            }

            if (recordLeft.keySet().size() == record.keySet().size()) {
                ret++;
            }
        }

        return ret;
    }
}