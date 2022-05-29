// AC: Runtime: 158 ms, faster than 30.57% of Java online submissions for Maximum Product of Word Lengths.
// Memory Usage: 102.2 MB, less than 14.36% of Java online submissions for Maximum Product of Word Lengths.
// brute-force
// T:O(n^2 * 26^2), S:O(26 * n)
// 
class Solution {
    public int maxProduct(String[] words) {
        int len = words.length, ret = 0;
        String[] record = new String[len];
        for (int i = 0; i < len; i++) {
            HashSet<Character> wordRecord = new HashSet<>();
            for (char c : words[i].toCharArray()) {
                wordRecord.add(c);
            }
            StringBuilder sb = new StringBuilder();
            for (char c : wordRecord) {
                sb.append(c);
            }
            record[i] = sb.toString();
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp = words[i].length() * words[j].length();
                if (temp > ret) {
                    boolean flag = true;
                    for (char c : record[i].toCharArray()) {
                        if (record[j].indexOf(c) != -1) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        ret = temp;
                    }
                }
            }
        }

        return ret;
    }
}