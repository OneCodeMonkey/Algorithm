// AC: Runtime 6 ms Beats 60.96% 
// Memory 83.1 MB Beats 60.4%
// Prefix Sum.
// T:O(m + n), S:O(m + n)
// 
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int len = words.length, countSum = 0, pos = 0;
        int[] count = new int[len + 1], ret = new int[queries.length];
        count[0] = 0;
        for (String word : words) {
            if (vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1))) {
                countSum++;
            }
            count[++pos] = countSum;
        }
        pos = 0;
        for (int[] query : queries) {
            ret[pos++] = count[query[1] + 1] - count[query[0]];
        }

        return ret;
    }
}
