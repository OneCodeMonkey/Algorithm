// Runtime 6 ms Beats 6.80% 
// Memory 43.04 MB Beats 28.87%
// Greedy.
// T:O(n), S:O(1)
// 
class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.merge(c, 1, Integer::sum);
        }
        int ret = 0;
        if (charCount.size() > k) {
            int[][] sorting = new int[charCount.size()][2];
            int pos = 0;
            for (char c : charCount.keySet()) {
                sorting[pos++] = new int[]{charCount.get(c), c - 'a'};
            }
            Arrays.sort(sorting, Comparator.comparingInt(a -> a[0]));
            for (int i = 0; i < charCount.size() - k; i++) {
                ret += sorting[i][0];
            }
        }

        return ret;
    }
}
