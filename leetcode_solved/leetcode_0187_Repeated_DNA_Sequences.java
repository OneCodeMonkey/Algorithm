// AC: Runtime: 15 ms, faster than 86.88% of Java online submissions for Repeated DNA Sequences.
// Memory Usage: 48 MB, less than 33.47% of Java online submissions for Repeated DNA Sequences.
// Using hashSet, if a 10-length substring has occurred in previous, add to result.
// T:O(n), S:O(n)
// 
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int size = s.length();
        List<String> ret = new LinkedList<>();
        if (size <= 10) {
            return ret;
        }
        HashSet<String> record = new HashSet<>();
        HashSet<String> dup = new HashSet<>();
        for (int i = 0; i < size - 10 + 1; i++) {
            String temp = s.substring(i, i + 10);
            if (record.contains(temp)) {
                dup.add(temp);
            }
            record.add(temp);
        }
        ret.addAll(dup);

        return ret;
    }
}