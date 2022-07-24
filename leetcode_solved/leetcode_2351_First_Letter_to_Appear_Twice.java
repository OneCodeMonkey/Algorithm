// AC: Runtime: 1 ms, faster than 25.00% of Java online submissions for First Letter to Appear Twice.
// Memory Usage: 42 MB, less than 75.00% of Java online submissions for First Letter to Appear Twice.
// .
// T:O(n), S:O(1)
//
class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> record = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (record.contains(c)) {
                return c;
            }
            record.add(c);
        }

        return ' ';
    }
}