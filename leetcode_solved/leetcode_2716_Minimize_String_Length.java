// AC: Runtime 9 ms Beats 100% 
// Memory 44.2 MB Beats 25%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int minimizedStringLength(String s) {
        int len = s.length(), ret = 0;
        HashSet<Character> record = new HashSet<>();
        for (char c : s.toCharArray()) {
            record.add(c);
        }

        return record.size();
    }
}
