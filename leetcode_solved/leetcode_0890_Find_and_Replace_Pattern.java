// AC: Runtime: 1 ms, faster than 89.54% of Java online submissions for Find and Replace Pattern.
// Memory Usage: 38.9 MB, less than 78.08% of Java online submissions for Find and Replace Pattern.
// using two char[26] to judge the string pattern same or not.
// T:O(words.length * pattern.length), S:O(1)
// 
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int size = words.length;
        List<String> ret = new LinkedList<>();

        for (String word : words) {
            boolean flag = true;
            int[] c1 = new int[26], c2 = new int[26];
            for (int j = 0; j < pattern.length(); j++) {
                int temp = word.charAt(j) - 'a', temp2 = pattern.charAt(j) - 'a';
                if (c1[temp] != c2[temp2]) {
                    flag = false;
                    break;
                }
                c1[temp] = j + 1;
                c2[temp2] = j + 1;
            }
            if (flag) {
                ret.add(word);
            }
        }

        return ret;
    }
}