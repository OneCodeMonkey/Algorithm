// AC: Runtime: 29 ms, faster than 13.22% of Java online submissions for First Unique Character in a String.
// Memory Usage: 39.4 MB, less than 49.91% of Java online submissions for First Unique Character in a String.
// hashmap
// T:O(n), S:O(1), （char 数量不过26）
// 
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> time = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            time.merge(c, 1, Integer::sum);
        }
        for (int i = 0; i < s.length(); i++) {
            if (time.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}