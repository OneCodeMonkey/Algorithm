// Runtime 31 ms Beats 37.08% 
// Memory 47.65 MB Beats 94.94%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> record = new HashSet<>();
        for (char c : s.toCharArray()) {
            record.add(c);
        }

        return record.size();
    }
}
