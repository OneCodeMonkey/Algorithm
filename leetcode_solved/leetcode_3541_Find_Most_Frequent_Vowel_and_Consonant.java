// Runtime 6 ms Beats 100.00% 
// Memory 43.15 MB Beats 100.00%
// Map.
// T:O(n), S:O(1)
// 
class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowelCount = new HashMap<>(), consonantCount = new HashMap<>();
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                vowelCount.merge(c, 1, Integer::sum);
            } else {
                consonantCount.merge(c, 1, Integer::sum);
            }
        }
        int val1 = 0, val2 = 0;
        for (char c : vowelCount.keySet()) {
            val1 = Math.max(val1, vowelCount.get(c));
        }
        for (char c : consonantCount.keySet()) {
            val2 = Math.max(val2, consonantCount.get(c));
        }

        return val1 + val2;
    }
}
