// 1. Brute-force
// Runtime: 5 ms, faster than 34.68% of Java online submissions for String Matching in an Array.
// Memory Usage: 39.5 MB, less than 5.75% of Java online submissions for String Matching in an Array.
//
class Solution {
    public List<String> stringMatching(String[] words) {
        int size = words.length;
        List<String> ret = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i || words[i].length() >= words[j].length()) {
                    continue;
                }
                if (words[j].contains(words[i])) {
                    if (!ret.contains(words[i])) {
                        ret.add(words[i]);
                    }
                }
            }
        }
        return ret;
    }
}

// 2.