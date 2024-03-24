// Runtime 7 ms Beats 100.00% of users with Java
// Memory 43.21 MB Beats 100.00% of users with Java
// .
// T:O(n), S:O(n)
// 
class Solution {
    public boolean isSubstringPresent(String s) {
        HashSet<String> record = new HashSet<>();
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i), c2 = s.charAt(i + 1);
            if (c == c2) {
                return true;
            }
            String rev = String.valueOf(c2) + c;
            if (record.contains(rev)) {
                return true;
            }
            record.add(String.valueOf(c) + c2);
        }

        return false;
    }
}
