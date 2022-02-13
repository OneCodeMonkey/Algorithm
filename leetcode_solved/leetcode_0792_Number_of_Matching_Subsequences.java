// AC: Runtime: 265 ms, faster than 20.38% of Java online submissions for Number of Matching Subsequences.
// Memory Usage: 77 MB, less than 52.29% of Java online submissions for Number of Matching Subsequences.
// hashmap and hashset.
// T:O(sum(words[i].length()) - O(words.length * s.length()), S:O(sum(words[i].length()))
// 
class Solution {
    HashMap<Character, Integer> charCount;
    HashSet<String> subSeqStr;

    public int numMatchingSubseq(String s, String[] words) {
        charCount = new HashMap<>();
        subSeqStr = new HashSet<>();
        for (char c : s.toCharArray()) {
            charCount.merge(c, 1, Integer::sum);
        }

        int ret = 0;
        for (String word : words) {
            // 1.first check duplicated input.
            if (subSeqStr.contains(word)) {
                ret++;
            } else {
                ret += checkIsSubseq(word, s) ? 1 : 0;
            }
        }

        return ret;
    }

    private boolean checkIsSubseq(String s1, String s2) {
        // 2.next, check char count.
        HashMap<Character, Integer> charCountS1 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            charCountS1.merge(c, 1, Integer::sum);
        }
        for (char c : charCountS1.keySet()) {
            if (!charCount.containsKey(c) || charCountS1.get(c) > charCount.get(c)) {
                return false;
            }
        }

        // 3.if not, check every char.
        int index1 = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (index1 < s1.length() && s2.charAt(i) == s1.charAt(index1)) {
                index1++;
            }
            if (index1 >= s1.length()) {
                subSeqStr.add(s1);
                return true;
            }
            // the chars remain is not enough to match.
            if (s2.length() - i < s1.length() - index1) {
                return false;
            }
        }

        return false;
    }
}
