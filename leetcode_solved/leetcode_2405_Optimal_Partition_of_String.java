// AC: Runtime: 55 ms, faster than 57.14% of Java online submissions for Optimal Partition of String.
// Memory Usage: 62.9 MB, less than 85.71% of Java online submissions for Optimal Partition of String.
// Thought: hashset, if we meet duplicate char, we cut once.
// T:O(n), S:O(n)
// 
class Solution {
    public int partitionString(String s) {
        HashSet<Character> record = new HashSet<>();
        int cutCount = 0;
        for (char c : s.toCharArray()) {
            if (record.contains(c)) {
                cutCount++;
                record.clear();
            }
            record.add(c);
        }

        return cutCount + 1;
    }
}
