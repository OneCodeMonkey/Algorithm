// AC: Runtime: 1 ms, faster than 32.04% of Java online submissions for Minimum Swaps to Make Strings Equal.
// Memory Usage: 37.5 MB, less than 31.49% of Java online submissions for Minimum Swaps to Make Strings Equal.
// count different position
// T:O(n), S:O(n)
// 
class Solution {
    public int minimumSwap(String s1, String s2) {
        int len = s1.length(), countX1 = 0, countY1 = 0, countX2 = 0, countY2 = 0;
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) == 'x') {
                    countX1++;
                } else {
                    countY1++;
                }
                if (s2.charAt(i) == 'x') {
                    countX2++;
                } else {
                    countY2++;
                }
            }
        }

        if ((countX1 + countX2) % 2 == 1) {
            return -1;
        }

        if (countX1 + countX2 > countY1 + countY2) {
            return (int)Math.ceil(countY1 * 1.0 / 2) + (int)Math.ceil(countY2 * 1.0 / 2);
        } else {
            return (int)Math.ceil(countX1 * 1.0 / 2) + (int)Math.ceil(countX2 * 1.0 / 2);
        }
    }
}