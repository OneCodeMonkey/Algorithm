// AC: Runtime: 70 ms, faster than 50.00% of Java online submissions for Delete Characters to Make Fancy String.
// Memory Usage: 94.1 MB, less than 50.00% of Java online submissions for Delete Characters to Make Fancy String.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public String makeFancyString(String s) {
        StringBuilder ret = new StringBuilder();
        int dupCount = 0;
        char lastChar = ' ';
        for (char c: s.toCharArray()) {
            if (lastChar == ' ') {
                dupCount = 1;
                lastChar = c;
                ret.append(c);
                continue;
            }

            if (c == lastChar) {
                if (dupCount >= 2) {
                    continue;
                } else {
                    dupCount++;
                    ret.append(c);
                }
            } else {
                dupCount = 1;
                ret.append(c);
                lastChar = c;
            }
        }

        return ret.toString();
    }
}