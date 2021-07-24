// AC: Runtime: 2 ms, faster than 89.50% of Java online submissions for Maximum Number of Words You Can Type.
// Memory Usage: 38.7 MB, less than 91.93% of Java online submissions for Maximum Number of Words You Can Type.
// .
// T:O(len(text) * strlen(brokenLetters)), S:O(1)
// 
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arrStr = text.split(" ");
        int ret = 0;

        for (String item: arrStr) {
            boolean flag = true;
            for (char c: brokenLetters.toCharArray()) {
                if (item.indexOf(c) != -1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ret++;
            }
        }

        return ret;
    }
}