// AC: Runtime: 43 ms, faster than 12.70% of Java online submissions for Construct K Palindrome Strings.
// Memory Usage: 51.8 MB, less than 9.89% of Java online submissions for Construct K Palindrome Strings.
// check odd count characters, k must not less than oddCount, and must not larger than s.length
// T:O(n), S:O(1)
// 
class Solution {
    public boolean canConstruct(String s, int k) {
        if (k <= s.length()) {
            HashMap<Character, Integer> record = new HashMap<>();
            for (char c : s.toCharArray()) {
                record.merge(c, 1, Integer::sum);
            }
            int oddCount = 0;
            for (char c : record.keySet()) {
                if (record.get(c) % 2 == 1) {
                    oddCount++;
                }
            }

            return oddCount <= k;
        }
        return false;
    }
}