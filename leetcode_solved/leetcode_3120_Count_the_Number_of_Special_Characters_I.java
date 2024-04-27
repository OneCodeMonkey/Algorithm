// Runtime 2 ms Beats 100.00% of users with Java
// Memory 42.20 MB Beats 50.00% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int numberOfSpecialChars(String word) {
        int ret = 0;
        HashSet<Character> record = new HashSet<>();
        for (char c : word.toCharArray()) {
            record.add(c);
        }
        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'A'), c2 = (char) (i + 'A' + 32);
            if (record.contains(c) && record.contains(c2)) {
                ret++;
            }
        }

        return ret;
    }
}
