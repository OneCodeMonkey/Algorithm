// AC: Runtime 1 ms Beats 100.00% of users with Java
// Memory 41.32 MB Beats 100.00% of users with Java
// Greedy. From 0-index, if c0 and c1 not equal or adjacent, forward, Otherwise count + 1, and forward two indexes.
// T:O(n), S:O(1)
// 
class Solution {
    public int removeAlmostEqualCharacters(String word) {
        int ret = 0, len = word.length();
        for (int i = 0; i < len - 1; i++) {
            char c1 = word.charAt(i), c2 = word.charAt(i + 1);
            if (c1 == c2 || Math.abs(c1 - c2) == 1) {
                if (i + 2 < len) {
                    i++;
                }
                ret++;
            }
        }

        return ret;
    }
}
