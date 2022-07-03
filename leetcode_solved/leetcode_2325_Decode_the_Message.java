// AC: Runtime: 7 ms, faster than 42.86% of Java online submissions for Decode the Message.
// Memory Usage: 44.2 MB, less than 42.86% of Java online submissions for Decode the Message.
// hashmap.
// T:O(max(m, n)), S:O(n), m=key.length(), n = message.length()
// 
class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> mapping = new HashMap<>();
        int charIndex = 0;
        for (char c : key.toCharArray()) {
            if (c >= 'a' && c <= 'z' && !mapping.containsKey(c)) {
                mapping.put(c, (char) (charIndex++ + 'a'));
            }
            if (mapping.size() >= 26) {
                break;
            }
        }
        StringBuilder ret = new StringBuilder();
        for (char c : message.toCharArray()) {
            ret.append(mapping.getOrDefault(c, c));
        }

        return ret.toString();
    }
}