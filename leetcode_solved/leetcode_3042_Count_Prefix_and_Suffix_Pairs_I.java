// Runtime 2 ms Beats 100.00% of users with Java
// Memory 42.18 MB Beats 100.00% of users with Java
// Brute-force.
// T:O(n ^ 2 * k), S:O(1)
// 
class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int len = words.length, ret = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (words[i].equals(words[j])) {
                    ret++;
                    continue;
                }
                if (words[i].length() < words[j].length() && words[j].startsWith(words[i]) &&
                        words[j].endsWith(words[i])) {
                    ret++;
                }
            }
        }

        return ret;
    }
}
