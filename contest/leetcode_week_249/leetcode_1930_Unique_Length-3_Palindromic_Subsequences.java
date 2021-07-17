// AC: Runtime: 74 ms, faster than 100.00% of Java online submissions for Unique Length-3 Palindromic Subsequences.
// Memory Usage: 51.5 MB, less than 50.00% of Java online submissions for Unique Length-3 Palindromic Subsequences.
// thought: record the start-index and end-index of every char, and count the distinct char between (start-index, end-index)
// T:O(n^2), S:O(1)
// 
class Solution {
    public int countPalindromicSubsequence(String s) {
        int size = s.length(), ret = 0;
        HashMap<Character, List<Integer>> charIndex = new HashMap<>();
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (charIndex.get(c) != null) {
                if (charIndex.get(c).size() == 1) {
                    charIndex.get(c).add(i);
                } else {
                    charIndex.get(c).set(1, i);
                }
            } else {
                List<Integer> tempList = new LinkedList<>();
                tempList.add(i);
                charIndex.put(c, tempList);
            }
        }
        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'a');
            if (charIndex.get(c) != null && charIndex.get(c).size() == 2) {
                HashSet<Character> tempRecord = new HashSet<>();
                int startIndex = charIndex.get(c).get(0), endIndex = charIndex.get(c).get(1);
                if (endIndex - startIndex == 1) {
                    continue;
                }
                for (int j = startIndex + 1; j <= endIndex - 1; j++) {
                    tempRecord.add(s.charAt(j));
                    // reach max possible value, break
                    if (tempRecord.size() == 26) {
                        break;
                    }
                }
                ret += tempRecord.size();
            }
        }

        return ret;
    }
}
