// Runtime 28 ms Beats 98.06% of users with Java
// Memory 45.92 MB Beats 23.09% of users with Java
// Map.
// T:O(n), S:O(n)
// 
class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        int len = word.length(), maxOccurrence = 0;
        HashMap<String, Integer> record = new HashMap<>();
        for (int i = 0; i < len; i += k) {
            record.merge(word.substring(i, i + k), 1, Integer::sum);
        }
        for (String segment : record.keySet()) {
            maxOccurrence = Math.max(maxOccurrence, record.get(segment));
        }

        return len / k - maxOccurrence;
    }
}
