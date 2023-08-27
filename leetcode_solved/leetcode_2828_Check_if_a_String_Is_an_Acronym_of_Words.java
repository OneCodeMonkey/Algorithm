// AC: Runtime 2 ms Beats 66.67%
// Memory 43.4 MB Beats 66.67%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.charAt(0));
            if (!s.startsWith(sb.toString())) {
                return false;
            }
        }

        return true;
    }
}
