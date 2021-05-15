// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Word Pattern.
// Memory Usage: 36.8 MB, less than 64.62% of Java online submissions for Word Pattern.
// hashmap 记录pattern 字母和 word 的映射关系，判断是否重复即可。
// T:O(len(pattern)), S:O(len(s))
//
class Solution {
    public boolean wordPattern(String pattern, String s) {
        int len1 = pattern.length();
        String[] splitS = s.split(" ");
        int len2 = splitS.length;
        if (len1 != len2) {
            return false;
        }
        HashMap<String, String> record = new HashMap<>();
        HashSet<String> words = new HashSet<>();
        for (int i = 0; i < len1; i++) {
            String characterTemp = String.valueOf(pattern.charAt(i));
            if (record.get(characterTemp) == null) {
                if (words.contains(splitS[i])) {
                    return false;
                }
                record.put(characterTemp, splitS[i]);
                words.add(splitS[i]);
            } else {
                if (!record.get(characterTemp).equals(splitS[i])) {
                    return false;
                }
            }
        }

        return true;
    }
}