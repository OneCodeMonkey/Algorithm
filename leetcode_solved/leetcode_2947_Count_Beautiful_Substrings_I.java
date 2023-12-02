// AC: Runtime 164 ms Beats 100.00% of users with Java
// Memory 41.55 MB Beats 100.00% of users with Java
// Brute-force
// T:O(n ^ 2), S:O(1)
// 
class Solution {
    public int beautifulSubstrings(String s, int k) {
        int len = s.length(), countVowel = 0, countConsonant = 0, ret = 0;
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (int i = 0; i < len; i++) {
            countVowel = 0;
            countConsonant = 0;
            for (int j = i; j < len; j++) {
                if (vowels.contains(s.charAt(j))) {
                    countVowel++;
                } else {
                    countConsonant++;
                }
                if ((j - i + 1) % 2 == 0 && countVowel == countConsonant && (countVowel * countConsonant % k == 0)) {
                    ret++;
                }
            }
        }

        return ret;
    }
}
