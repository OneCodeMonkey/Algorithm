// AC: Runtime: 35 ms, faster than 38.64% of Java online submissions for Maximum Length of a Concatenated String with Unique Characters.
// Memory Usage: 45.5 MB, less than 30.49% of Java online submissions for Maximum Length of a Concatenated String with Unique Characters.
// using a set to store unique possible combinations.
// T:O(n * 2^n * n * len(str)), S:O(2^n * n * len(s))
//
class Solution {
    private boolean checkUnique(String str) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c: str.toCharArray()) {
            if (charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }

        return true;
    }
    public int maxLength(List<String> arr) {
        int maxLen = 0;
        List<String> record = new LinkedList<>();
        record.add("");
        for (String str: arr) {
            if (!checkUnique(str)) {
                continue;
            }
            List<String> newAdd = new LinkedList<>();
            for (String candidate: record) {
                String temp = candidate + str;
                if (checkUnique(temp)) {
                    newAdd.add(temp);
                    maxLen = Math.max(maxLen, temp.length());
                }
            }
            record.addAll(newAdd);
        }

        return maxLen;
    }
}