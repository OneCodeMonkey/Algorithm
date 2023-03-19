// AC: untime 3 ms Beats 18.46% 
// Memory 42.4 MB Beats 59.69%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int ret = 0;
        for (int i = left; i <= right; i++) {
            String word = words[i];
            if (vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1))) {
                ret++;
            }
        }

        return ret;
    }
}
