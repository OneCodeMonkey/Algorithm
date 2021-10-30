// AC: Runtime: 10 ms, faster than 42.86% of Java online submissions for Number of Valid Words in a Sentence.
// Memory Usage: 41.1 MB, less than 14.29% of Java online submissions for Number of Valid Words in a Sentence.
// Do as the problem says.
// T:O(n), S:O(n)
//
class Solution {
    public int countValidWords(String sentence) {
        String[] arr = sentence.split(" ");
        int ret = 0;
        for (String str: arr) {
            int count1 = 0, count2 = 0;
            if (!str.trim().isEmpty()) {
                boolean flag = true;
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (c >= '0' && c <= '9') {
                        flag = false;
                        break;
                    }
                    if ((c == '.' || c == '!' || c == ',')) {
                        if (i != str.length() - 1) {
                            flag = false;
                            break;
                        }
                        count1++;
                        if (count1 > 1) {
                            flag = false;
                            break;
                        }
                    }
                    if (c == '-') {
                        if (i == 0 || i == str.length() - 1 || (str.charAt(i - 1) < 'a' || str.charAt(i - 1) > 'z') || (str.charAt(i + 1) < 'a' || str.charAt(i + 1) > 'z')) {
                            flag = false;
                            break;
                        }
                        count2++;
                        if (count2 > 1) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {
                    ret++;
                }
            }
        }
        return ret;
    }
}