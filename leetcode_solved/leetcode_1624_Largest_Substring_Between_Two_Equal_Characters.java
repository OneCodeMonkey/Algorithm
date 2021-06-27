// AC: Runtime: 1 ms, faster than 63.56% of Java online submissions for Largest Substring Between Two Equal Characters.
// Memory Usage: 37.3 MB, less than 24.35% of Java online submissions for Largest Substring Between Two Equal Characters.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ret = -1, size = s.length();
        HashMap<Character ,Integer> firstOccurIndex = new HashMap<>();
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (!firstOccurIndex.containsKey(c)) {
                firstOccurIndex.put(c, i);
            } else {
                ret = Math.max(ret, i - firstOccurIndex.get(c) - 1);
            }
        }

        return ret;
    }
}