// AC: Runtime 2ms Beats 100.00%of users with Java 
// Memory Details 43.68MB Beats 100.00%of users with Java
// Greedy.
// T:O(n), S:O(n)
// 
class Solution {
    public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        List<Integer> indexes = new LinkedList<>();
        int prev = groups[0];
        indexes.add(0);
        for (int i = 1; i < n; i++) {
            if (groups[i] != prev) {
                indexes.add(i);
                prev = groups[i];
            }
        }
        List<String> ret = new LinkedList<>();
        for (int i : indexes) {
            ret.add(words[i]);
        }

        return ret;
    }
}
