// Runtime 1 ms Beats 99.39% of users with Java
// Memory 42.15 MB Beats 32.35% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean isValid(String word) {
        List<Character> vowel = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        if (word.length() < 3) {
            return false;
        }
        boolean hasVowel = false, hasNonVowel = false;
        for (char c : word.toCharArray()) {
            if (c >= '0' && c <= '9') {
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (vowel.contains(c)) {
                    hasVowel = true;
                } else {
                    hasNonVowel = true;
                }
            } else {
                return false;
            }
        }

        return hasVowel && hasNonVowel;
    }
}
