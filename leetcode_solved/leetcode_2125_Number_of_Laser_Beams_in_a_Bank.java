// AC: Runtime: 11 ms, faster than 97.76% of Java online submissions for Number of Laser Beams in a Bank.
// Memory Usage: 39.6 MB, less than 85.71% of Java online submissions for Number of Laser Beams in a Bank.
// count every row's 1, multiple with last adjacent row's 1.
// T:O(sum(len(string))), S:O(1)
// 
class Solution {
    public int numberOfBeams(String[] bank) {
        int ret = 0, lastRow = -1;
        for (String str: bank) {
            int count = 0;
            for (char c: str.toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }
            if (count > 0) {
                if (lastRow != -1) {
                    ret += count * lastRow;
                }
                lastRow = count;
            }
        }

        return ret;
    }
}