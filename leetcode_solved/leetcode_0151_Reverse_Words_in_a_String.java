// AC: Runtime: 4 ms, faster than 84.91% of Java online submissions for Reverse Words in a String.
// Memory Usage: 38.7 MB, less than 97.68% of Java online submissions for Reverse Words in a String.
// split by single space, judge if every part is empty string, record non-empty substrings, and combine substrings reverse.
// T:O(n), S:O(n)
// 
class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        String[] arr = s.split(" ");
        for (String item: arr) {
            if (!"".equals(item)) {
                words.add(item);
            }
        }
        StringBuilder ret = new StringBuilder();
        int size = words.size();
        for (int i = size - 1; i >= 0; i--) {
            ret.append(words.get(i));
            if (i != 0) {
                ret.append(" ");
            }
        }

        return ret.toString();
    }
}