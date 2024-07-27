// Runtime 31 ms Beats 50.00%
// Memory 45.14 MB Beats 100.00%
// Game & Greedy: If there are any vowel, then the first player can win in every situation.
// T:O(n), S:O(1)
// 
class Solution {
    public boolean doesAliceWin(String s) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                return true;
            }
        }

        return false;
    }
}
