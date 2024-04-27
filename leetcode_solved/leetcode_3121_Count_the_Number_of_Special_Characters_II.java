// Runtime 47 ms Beats 50.00% of users with Java
// Memory 46.12 MB Beats 50.00% of users with Java
// Hashmap: Record the last occurence of every lowercase, and first occurence of every uppercase.
// T:O(n), S:O(1)
// 
class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> lowerLastOccurence = new HashMap<>(), upperFirstOccurence = new HashMap<>();
        int len = word.length(), ret = 0;
        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c)) {
                lowerLastOccurence.put(c, i);
            } else {
                upperFirstOccurence.putIfAbsent(c, i);
            }
        }
        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'A'), c2 = (char) (i + 'A' + 32);
            if (upperFirstOccurence.containsKey(c) && lowerLastOccurence.containsKey(c2) &&
                    lowerLastOccurence.get(c2) < upperFirstOccurence.get(c)) {
                ret++;
            }
        }

        return ret;
    }
}
