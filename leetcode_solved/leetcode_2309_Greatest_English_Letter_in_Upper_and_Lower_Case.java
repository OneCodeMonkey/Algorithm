// AC: Runtime: 13 ms, faster than 25.00% of Java online submissions for Greatest English Letter in Upper and Lower Case.
// Memory Usage: 42 MB, less than 100.00% of Java online submissions for Greatest English Letter in Upper and Lower Case.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public String greatestLetter(String s) {
        char ret = ' ';
        HashSet<Character> record = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z' && record.contains(Character.toLowerCase(c))) {
                if (c > ret) {
                    ret = c;
                }
            } else if (c >= 'a' && c <= 'z' && record.contains(Character.toUpperCase(c))) {
                if (Character.toUpperCase(c) > ret) {
                    ret = Character.toUpperCase(c);
                }
            }
            record.add(c);
        }

        return ret != ' ' ? String.valueOf(ret) : "";
    }
}