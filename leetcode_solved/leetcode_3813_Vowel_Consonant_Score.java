// Runtime 3 ms Beats 6.46% 
// Memory 44.19 MB Beats 6.86%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int vowelConsonantScore(String s) {
        int consonantCount = 0, vowelCount = 0;
        HashSet<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (char c : s.toCharArray()) {
            if (vowel.contains(c)) {
                vowelCount++;
            } else if (c >= 'a' && c <= 'z') {
                consonantCount++;
            }
        }

        return consonantCount == 0 ? 0 : (vowelCount / consonantCount);
    }
}
