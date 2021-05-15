// AC: Runtime: 2 ms, faster than 19.40% of Java online submissions for Unique Number of Occurrences.
// Memory Usage: 36.7 MB, less than 74.74% of Java online submissions for Unique Number of Occurrences.
// 略
// T:O(n), S:O(n)
// 
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> record = new HashMap<>();
        HashSet<Integer> uniq = new HashSet<>();
        for (int i: arr) {
            record.merge(i, 1, Integer::sum);
        }
        for (int i: record.keySet()) {
            if (uniq.contains(record.get(i))) {
                return false;
            }
            uniq.add(record.get(i));
        }
        return true;
    }
}